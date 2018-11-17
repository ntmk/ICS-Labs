# Type all other functions here
def get_num_of_non_WS_characters(usrStr):
    return len(usrStr.replace(' ',''))
def get_num_of_words(usrStr):
    return len(usrStr.split())
    
def fix_capitalization(usrStr):
    result =''
    count = 0
    newSentence = True
    for c in usrStr:
        if newSentence:
            if c.islower():
                c = c.upper()
                newSentence = False
                count += 1
            elif c.isupper():
                newSentence = False
        result = result + c
        if c in '.!?':
            newSentence = True
    return result, count
    
def shorten_space(usrStr):
    result = ' '.join(usrStr.split())
    return result
    
def replace_punctuation(usrStr, **kwargs):
    result = ''
    for c in usrStr:
        if c == '!':
            kwargs['exclamationCount'] += 1
            c = '.'
        elif c == ';':
            kwargs['semicolonCount'] += 1
            c = ','
        result += c
    print('Punctuation replaced')
    print('exclamationCount:', kwargs['exclamationCount'])
    print('semicolonCount:', kwargs['semicolonCount'])
    return result
    
def print_menu(usrStr):
    menu = '''MENU
c - Number of non-whitespace characters
w - Number of words
f - Fix capitalization
r - Replace punctuation
s - Shorten spaces
q - Quit

Choose an option: '''
    print(menu)
    menuOp = input()
       
    if menuOp == 'c':
        n = get_num_of_non_WS_characters(usrStr)
        print('Number of non-whitespace characters:', n)
        print()
    
    elif menuOp == 'w':
        m = get_num_of_words(usrStr)
        print('Number of words:', m)
        print()
        
    elif menuOp == 'f':
        usrStr, count = fix_capitalization(usrStr)
        print('Number of letters capitalized:', count)
        print('Edited text:', usrStr)
        print()
        
    elif menuOp == 's':
        usrStr = shorten_space(usrStr)
        print('Edited text:', usrStr)
        print()
        
    elif menuOp == 'r':
        usrStr = replace_punctuation(usrStr, exclamationCount = 0, semicolonCount = 0)
        print('Edited text:', usrStr)
        print()
        
   # Complete print_menu() function
    return menuOp, usrStr
if __name__ == '__main__':
    
    usrStr = input('Enter a sample text: \n', )
    print('You entered:', usrStr)
    print()
    m = ''
    while m != 'q':
        m, usrStr = print_menu(usrStr)