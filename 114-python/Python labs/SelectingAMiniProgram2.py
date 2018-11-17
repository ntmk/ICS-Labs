def triangle(character, height):
    for i in range(1,height+1):
        print((height - i) * ' ' + i * character )
def isPrime(number):
    for i in range(2, number):
        prime = 1
        if(number % i == 0):
            print('The value '+ str(number) +' is not a prime number.')
            prime = 0
    if(prime == 1):
        print('The value ' + str(number) + ' is a prime number.')
    
def classify(number):
	sum = 0;
	for i in range(1, number - 1):
		if(number % i == 0):
		    sum = sum + i
	if(sum < number):
		print('\nThe value '+ str(number) + ' is a deficient number.')
	elif(sum == number):
		print('\nThe value '+ str(number) + ' is a perfect number.')
	else:
		print('\nThe value '+ str(number) + ' is an abundant number.')
    
def gcd(num1, num2):
	smaller = num1	
	if(num2 < num1):
		smaller = num2
	greatest = 1
	for i in range(1, smaller + 1):
		if(num1%i == 0 and num2%i == 0):
			greatest = i		
	print('The GCD of '+ str(num1)+' and '+ str(num2) +' is '+ str(greatest)+'.')
    
#######################
# Main program
program = input("Enter the program code: ")
if program == "P1":
    character = input("Enter a character: ")
    height = int(input("Enter triangle height: "))
    triangle(character, height)
elif program == "P2":
    num = int(input('Enter a positive integer:'))
    isPrime(num)
elif program == "P3":
    num = int(input('Enter a positive integer:'))
    classify(num)
elif program == "P4":
    num1 = int(input('Enter a positive integer:'))
    num2 = int(input('Enter a positive integer:'))
    gcd(num1,num2)
else:
    print("Bad program code. Goodbye.")