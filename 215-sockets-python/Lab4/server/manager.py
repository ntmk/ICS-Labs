import threading, collections, time
from clientHandler import ClientHandler

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
