import sys
from urllib.parse import urlparse
import socket
	
url = sys.argv[1]
parsedurl = urlparse(url)
parsedhtmlurl = urlparse(url)
webHost = parsedurl.netloc
resource = parsedurl.path

if resource == '':
	resource = '/'
if url == resource:
	webHost = parsedurl.path
	resource = '/'

try:
	webHost = socket.gethostbyname(webHost)
except:
	print('\nThere was an error resolving host')

s1 = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s2 = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
try:
	s1.connect( (webHost, 80) )
except Exception as e:
	print('\nSomething has gone wrong with webHost %s. Exception is %s ' % (webHost, e))
finally:
	request = "GET /%s HTTP/1.1\r\nhost: %s \r\n\r\n" % (resource, webHost)
	s1.send(request.encode())
	
html2text = "rtvm.cs.camosun.bc.ca"
htmlresource = "/ics200/lab1test1.html"
try:
	html2text = socket.gethostbyname(html2text)
except:
	print('\nthere was an error resolving html2text host')

try:
	s2.connect( (html2text, 10010) )
except Exception as e:
	print('\nSomething has gone wrong with %s. Exception is %s ' % (html2text, e))	
finally:
	status = s2.recv(700).decode()
	
state = 1
while state != 4:
	if state == 1:
		 
		response1 = s1.recv(1024).decode('utf-8')
		if '<HTML>' in response1.upper() and '</HTML>' in response1.upper():
			htmlend = response1.upper().find('</HTML>'.upper()) + 7
			htmlstart = response1.upper().find('<HTML>'.upper())
			firstsent = s2.send(response1[htmlstart:htmlend].encode())
			state = 3
		if '<HTML>' in response1.upper():
			htmlstart = response1.upper().find('<HTML>'.upper())
			s3 = s2.send(response1[htmlstart:].encode())
			state = 2
			
	if state == 2:
		response2 = s1.recv(1024).decode('utf-8')
		if '</HTML>' in response2.upper() or '</HTML>' in response1.upper() + response2.upper():
			htmlend = response2.upper().find('</HTML>'.upper()) + 7
			test = s2.send(response2[:htmlend].encode())
			state = 3
		else:
			test2 = s2.send(response2.encode())
			#print(test2)
			state = 2

	if state == 3:
		text = s2.recv(1024).decode('utf-8')
		end = text.find('ICS 200 HTML CONVERT COMPLETE')
		if end == -1:
			newtext = s2.recv(1024).decode('utf-8')
			#print('\n\nfirst set of text\n' + str(text.encode()) + '\n\nsecond group of text\n' + str(newtext.encode()))
			if text+newtext != -1:
				alltext = text+newtext
				test = s2.recv(1024).decode('utf-8')
				alltext = text+newtext+test
				end = alltext.find('ICS 200 HTML CONVERT COMPLETE')
				print(alltext[:end], end='')
				state =4
		else:
			print(text[:end])
			state = 4
			
	if state == 4:
		s1.close()
		s2.close()

