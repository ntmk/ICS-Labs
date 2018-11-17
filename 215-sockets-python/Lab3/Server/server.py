import socket
import sys
import os

def printstuff(a):
	if '-v' in sys.argv:
		print(a)
		sys.stdout.flush()
	else:
		pass

port = int(sys.argv[1])

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

s.bind(('', port))

s.listen(0)

while True:
	servermessage = 'Server waiting on port: %s.' % port
	printstuff(servermessage)
	# accept the connection
	c, addr = s.accept()
	servermessage = 'Server connected to client at %s:%s' % (addr[0],port)
	printstuff(servermessage)
	# tell client you are ready for more
	c.send('READY'.encode('utf-8'))
	try:
		# recieve command and filename
		data = c.recv(1024).decode()
		data = data.split(' ')
		servermessage = 'Server recieving request: %s for %s' % (data[0],data[1])
		printstuff(servermessage)
		file_name = data[1]
	except:
		servermessage = 'Did not recieve a command or file to process'
		printstuff(servermessage)

	if 'GET' in data:
		if os.path.exists(file_name) and os.access(file_name, os.R_OK):
			#notify client that server has received the file name and command
			c.send('OK'.encode('utf-8'))
			#look for the READY message from client
			clientresponse = c.recv(1024).decode('utf-8')
			if 'READY' in clientresponse:
				#find the size of selected file
				file_size = os.path.getsize(file_name)
				servermessage = 'Server sending: %s bytes' % file_size
				printstuff(servermessage)
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


	if 'PUT' in data:
		if os.access(file_name, os.W_OK):
			#tell the client you have received the command and the file name
			c.send('OK'.encode('utf-8'))

			byte = c.recv(1024)
			file_size = int.from_bytes(byte, byteorder = 'big')
			servermessage = 'Server receiving: %s bytes' % file_size
			printstuff(servermessage)
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
		else:
			error = 'ERROR: unable to create %s' % file_name
			c.send(error.encode('utf-8'))

	if 'DEL' in data:
		if os.path.exists(file_name) and os.access(file_name, os.W_OK):
			#remove selected file
			servermessage = 'Server deleting file: %s' % data[1]
			printstuff(servermessage)
			os.remove(file_name)
			#notify client when complete
			c.send('DONE'.encode('utf-8'))
		else:
			error = 'ERROR: %s file does not exist' % file_name
			c.send(error.encode('utf-8'))

c.close()
