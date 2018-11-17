
while True:
    print('Enter input string: ')
    user = str(input())
    if user == 'q':
        break
    if user.find(',')!=-1:
        words = user.split(',')
        print('First word:',words[0].strip())
        print('Second word:',words[1].strip() + '\n')
        print()
    else:
        print('Error: No comma in string.')



