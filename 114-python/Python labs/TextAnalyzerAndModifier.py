def get_num_of_characters(user):
    print(len(user))
    return len(user)

#def output_without_whitespace(user):
  #  user = ''.join(user.split())
   # return user

if __name__ == '__main__':
    
    user = input('Enter a sentence or phrase: \n')
    user1 = ''.join(user.split())
    print('You entered:',user)
    print('\nNumber of characters:', len(user))
    print('String with no whitespace:',user1)