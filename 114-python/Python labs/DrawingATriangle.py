print ('Enter a character: ')
char = input()

print ('Enter triangle height: ')
size = int(input())

for i in range(1, size+1):
    print('%s ' % char * i)