# FIXME (1): Finish reading another word and an integer into variables. 
# Output all the values on a single line
color = input('Enter favorite color: \n')
name = input('Enter pet\'s name: \n')
num = input('Enter a number: \n\n')

print(color+' '+name+' '+num)


# FIXME (2): Output two password options
password1 = color+'_'+name
password2 = num+color+num

print('\nFirst password:',password1)
print('Second password:',password2)
print('\nNumber of characters in %s: %d' % (password1,len(password1)))
print('Number of characters in %s: %d' % (password2,len(password2)))


# FIXME (3): Output the length of the two password options
