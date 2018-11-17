import socket, time, random
import sys
import os

host = sys.argv[1]
port = int(sys.argv[2])
command = sys.argv[3].upper()
file = sys.argv[4]

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
	s.connect( (host, port) )
except Exception as e:
	print('\nSomething has gone wrong with host %s. Exception is %s ' % (host, e))

#once connection is made ask if server is ready
#get the server response - will reply READY when good to go
reply = s.recv(1024).decode('utf-8')
print('The reply from the server is ', reply)

command_file = command + ' ' + file

if command == 'GET':
	#sending the command and file to server
	s.send(command_file.encode('utf-8'))
	#server response OK
	serverresponse = s.recv(1024).decode('utf-8')
	#if the file requested does not exist notify the user and close socket
	if 'ERROR' in serverresponse.upper():
		error = serverresponse.split(':')
		error = 'Server error: %s' % error[1]
		print(error)
		s.close()
	if 'OK' in serverresponse:
		#tell the server client ready to receive # of bytes
		s.send('READY'.encode('utf-8'))
		#recieve the amount of bytes being sent and convert from little endian
		byte = s.recv(1024)
		file_size = int.from_bytes(byte, byteorder = 'big')
		# print('The bytes are ', file_size)
		#tell server its OK to send the file
		time.sleep(random.randint(2,6))

		s.send('OK'.encode('utf-8'))
		print('Client receiving file %s : %i' % (file, file_size))
		#check to see if its possible to write the file
		try:
		#write the file to the current directory
			with open(file, 'wb') as f:
				while file_size > 0:
					file_data = s.recv(min(1024, file_size))
					f.write(file_data)
					file_size -= len(file_data)
			#server sends done when full file
			done = s.recv(1024).decode('utf-8')
			if 'DONE' in done:
				#tell the user that the file transfer is complete
				print('Complete')
		except:
			print('Client error: unable to create file %s' % file)
			s.close()

if command == 'PUT':
	try:
		#find the size of the file
		file_size = os.path.getsize(file)
		#send the command and file name to the server
		s.send(command_file.encode('utf-8'))
		#receive the OK response from the server
		serverresponse = s.recv(1024).decode('utf-8')
		if 'ERROR' in serverresponse:
			error = serverresponse.split(':')
			error = 'Server error: %s' % error[1]
			print(error)
			s.close()
		if 'OK' in serverresponse:
			#send the size of the file to the server in little endian
			s.send(file_size.to_bytes(8, byteorder = 'big'))
			print('Client sending file %s : %i bytes.' % (file, os.path.getsize(file)))
			#receive the OK response from server to send file
			serverresponse = s.recv(1024).decode('utf-8')
			if 'OK' in serverresponse:
				count = 0
				#send the file to the server
				with open(file, 'rb') as f:
					while count < file_size:
						file_data = f.read(1024)#.encode()
						#send the file to the server
						s.send(file_data)
						count +=len(file_data)
				#receive DONE message from server
				done = s.recv(1024).decode('utf-8')
				if 'DONE' in done:
					#tell the user file transfer has completed
					print('Complete')
	except:
		print('Client error: %s does not exist' % file)
		s.close()

if command == 'DEL':
	#tell the server what file you want to delete
	s.send(command_file.encode('utf-8'))
	#receive the Done response when deletion is complete
	done = s.recv(1024).decode('utf-8')
	#notify client if file does not exist
	if 'ERROR' in done:
		error = done.split(':')
		error = 'Server error: %s' % error[1]
		print(error)
		s.close()
	else:
		print('Client deleting file %s' % file)
	if 'DONE' in done:
		#tell user when complete
		print('Complete')

s.close()
