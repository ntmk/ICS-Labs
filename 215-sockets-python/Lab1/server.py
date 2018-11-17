# first of all import the socket library
import socket               

# next create a socket object
s = socket.socket()         
print ("Socket successfully created")

port = 80              
s.bind(('', port))        
print ("socket binded to %s" %(port))
s.listen(5)     
print ("socket is listening")   
while True:
 
   c, addr = s.accept()     
   print ('Got connection from', addr)

   test = ('Thank you for connecting')
   c.send(test.encode('utf-8'))
 
   c.close() 