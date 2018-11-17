import sys, os, threading, socket, collections, time
# import threading, collections, time
# import socket, sys, os, threading
#will use threading.method()

class ClientHandler(threading.Thread):
    #constructor for the manager class
    def __init__(self, client): # add params as needed
        # call the constructor from the thread class
        threading.Thread.__init__(self)
        self.c = client
        # print('Socket thread for: ' % str(self.c))

    def run(self):
        c = self.c
        # print('in the run method for client handler')

    	# tell client you are ready for more
        c.send('READY'.encode('utf-8'))
        try:
        # recieve command and filename
            data = c.recv(1024).decode()
            data = data.split(' ')
            print('Server recieving request: %s for %s' % (data[0],data[1]))
            file_name = data[1]
        except:
            print('Did not recieve a command or file to process')

        if 'GET' in data:
            if os.path.exists(file_name) and os.access(file_name, os.R_OK):
            #notify client that server has received the file name and command
                c.send('OK'.encode('utf-8'))
                #look for the READY message from client
                clientresponse = c.recv(1024).decode('utf-8')
                if 'READY' in clientresponse:
                    #find the size of selected file
                    file_size = os.path.getsize(file_name)
                    print('Server sending: %s bytes' % file_size)
                    #send the size to client formatted in little endian
                    c.send(file_size.to_bytes(8, byteorder = 'big'))
                    #get the OK from client to send file
                    clientresponse = c.recv(1024).decode('utf-8')
                    if 'OK' in clientresponse:
                        count = 0
                        #open and read the selected file (shouldnt have to encode or decode)
                        with open(file_name, 'rb') as f:
                            while count < file_size:
                            	file_data = f.read(1024)#.encode()
                            	#send the file to the server
                            	c.send(file_data)
                            	count +=len(file_data)
                        #once file has been sent let the client know your finished
                        c.send('DONE'.encode())
            else:
                error = 'ERROR: %s file does not exist' % file_name
                c.send(error.encode('utf-8'))

        # TODO: ask rob why program doesnt have permission to write when using os.access
        # otherwise program works fine
        if 'PUT' in data:
            # print('put found checking os permission to write')
            #
            # if os.access(file_name, os.W_OK):
            #     print('access to write is possible')

            #tell the client you have received the command and the file name
            c.send('OK'.encode('utf-8'))

            byte = c.recv(1024)
            file_size = int.from_bytes(byte, byteorder = 'big')
            print('Server receiving: %s bytes' % file_size)
            #receive the amount of bytes being sent from the client
            #send the OK to receive the file
            c.send('OK'.encode('utf-8'))
            #retreive and write the file
            with open(file_name, 'wb') as f:
                while file_size > 0:
                    #read the file and send in blocks unless file size is less than 1024
                    #then just send the exact amount
                    file_data = c.recv(min(1024, file_size))
                    f.write(file_data)
                    file_size -= len(file_data)
                #send confirmation when complete
                c.send('DONE'.encode())
            # else:
            #     error = 'ERROR: unable to create %s' % file_name
            #     c.send(error.encode('utf-8'))

        if 'DEL' in data:
            if os.path.exists(file_name) and os.access(file_name, os.W_OK):
                #remove selected file
                print('Server deleting file: %s' % data[1])
                os.remove(file_name)
                #notify client when complete
                c.send('DONE'.encode('utf-8'))
            else:
                error = 'ERROR: %s file does not exist' % file_name
                c.send(error.encode('utf-8'))


# import threading, collections, time
# from clientHandler import ClientHandler

class Manager(threading.Thread):
    #constructor for the manager class instantiating all variable
    def __init__(self, set_count):
        threading.Thread.__init__(self)
        self.set_count = set_count
        self.q = collections.deque()
        self.running = set()

    # method to add client to the que
    def add(self, c):
        self.q.append(c)
        # print('Client was added to queue.')

    # overrode threading run method to check status of queue set and threads
    def run(self):
        while True:
            running = self.running
            garbage = []
            # if the q is empty sleep for a second and return to the top of the loop
            if not self.q:
                time.sleep(1)
                continue
            else:
                # check if the set is full if it is start garbage collecting
                if len(running) > 0:
                    for thread in running:
                        if thread.is_alive() == False:
                            garbage.append(thread)
                            # print("Found a dead thread moving it to garbage")
                    # remove all dead threads from the garbage array
                    for trash in garbage:
                        running.remove(trash)
                        # print('Taking out all the trash threads')
                    # sleep for a second then return to the top of the loop

                    # continue
                # if there is room create and start the client thread then add it to the running set
                while len(running) < 5 and len(self.q) > 0:
                    c = self.q.popleft()
                    clientHandler = ClientHandler(c)
                    clientHandler.start()
                    running.add(clientHandler)
                    # print('Current status of the set is %s' % str(running))
                time.sleep(1)


# import socket, sys, os, threading
# from manager import Manager

port = int(sys.argv[1])
set_count = sys.argv[2]
# create manaer object and pass the max set count
manager = Manager(set_count)
# start the manager thread
manager.start()
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

s.bind(('', port))

s.listen(5)

while True:
	# print('Server waiting on port: %s.' % port)
	# accept the connection
	c, addr = s.accept()
	#send connections to the thread class
	# print('Server connected to client at %s:%s' % (addr[0],port))
	# pass the new thread to the manager to add to queue
	manager.add(c)


s.close()
