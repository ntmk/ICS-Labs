import socket
import sys

HOST = ''
PORT = int(sys.argv[1])

s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

try:
	s.bind((HOST, PORT))
except socket.error as msg:
	print ('Bind failed. Error Code : ' + str(msg[0]) + ' Message ' + msg[1])
	sys.exit()

while True:
	# receive data from client (data, addr)
	d = s.recvfrom(1024)
	data = d[0]
	addr = d[1]

	if not data:
		break

	if data[0] == 0b00000001:
		result = 0
		for i in data[2:]:
			number1 = (i & 0b11110000) >> 4
			print('the first number is %s' % str(number1))
			number2 = (i & 0b00001111)
			print('the second number is %s' % str(number2))
			value = number1 + number2
			result += value
		reply = result.to_bytes(4, byteorder='big', signed = True)
		test = s.sendto(reply,addr)

	if data[0] == 0b00000010:
		result = None
		for i in data[2:]:
			if result == None:
				number1 = (i & 0b11110000) >> 4
				number2 = (i & 0b00001111)
				result = abs(number1)
				result -= number2
			else:
				number1 = (i & 0b11110000) >> 4
				result -= number1
				number2 = (i & 0b00001111)
				result -= number2
		reply = result.to_bytes(4, byteorder='big', signed = True)
		test = s.sendto(reply,addr)

	if data[0] == 0b00000100:
		result = None
		for i in data[2:]:
			if result == None:
				number1 = (i & 0b11110000) >> 4
				number2 = (i & 0b00001111)
				result = number1
				result *= number2
			else:
				number1 = (i & 0b11110000) >> 4
				result *= number1
				number2 = (i & 0b00001111)
				if number2 != 0:
					result *= number2
		reply = result.to_bytes(4, byteorder='big', signed = True)
		test = s.sendto(reply,addr)
s.close()
