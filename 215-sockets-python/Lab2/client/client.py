import sys
from urllib.parse import urlparse
import socket
import itertools

host = sys.argv[1]
port = int(sys.argv[2])
operator = sys.argv[3]
even_numbers = sys.argv[4::2]
odd_numbers = sys.argv[5::2]
# print('The even #s are %s' % str(even_numbers))
# print('The odd #s are %s' % str(odd_numbers))

try:
	host = socket.gethostbyname(host)
except:
	print('\nThere was an error resolving host')

s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

buffer = bytearray()

operatorvalue = 0b00000000
if sys.argv[3] == '+':
	mask = 0b00000001
	result = operatorvalue ^ mask
#	print('Value of + to insert into byte array ' + bin(result))
	buffer.append(result)

if sys.argv[3] == '-':
	mask = 0b00000010
	result = operatorvalue ^ mask
#	print('Value of - to insert into byte array ' + bin(result))
	buffer.append(result)

if sys.argv[3] == '*':
	mask = 0b00000100
	result = operatorvalue ^ mask
#		print('Value of * to insert into byte array ' + bin(result))
	buffer.append(result)


# print('buffer with operator is %s' % str(buffer))
buffercount = len(even_numbers) + len(odd_numbers)
# print('This is the buffer count %d' % buffercount)
buffer.append(buffercount)
# print('the buffer after count is added %s' % str(buffer))

difference = len(even_numbers) - len(odd_numbers)
for p,q in itertools.zip_longest(even_numbers, odd_numbers):
	# print('p value is %s q value is %s' % (p,q))
	if not q:
		q = 0
	p = int(p) << 4
	# print(p)
	q = int(q)
	value = p | q
	buffer.append(value)
	# print('p value is %s q value is %s' % (p,q))


msg = buffer

try :
	s.sendto(msg, (host, port))
	d = s.recvfrom(1024)
	reply = d[0]
	addr = d[1]
	#print('Server reply before byte conversion : ' + str(reply))
	reply = int.from_bytes(reply, byteorder='big', signed = True)

	print ('Calculated answer is : ' + str(reply))

except socket.error as msg:
	print ('Failed to send data to server')
	sys.exit()
