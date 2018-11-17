def chart(title, header1, header2):   
    print()
    print(title.rjust(33))
    print(header1.ljust(20) + '|' + header2.rjust(23))
    print("--------------------------------------------")    
    for name,num in tc:
        print('%-20s'%name+'|'+'%23d'%num)
def novels():
    print()
    for name,num in tc:
            print(('%20s'%name),(num * '*'))
            num -= 1
        

title = input('Enter a title for the data: \n')
print('You entered:',title)
header1 = input('\nEnter the column 1 header: \n')
print('You entered:',header1)
header2 = input('\nEnter the column 2 header: \n')
print('You entered:',header2)
tc = []
#data_point = input('\nEnter a data point (-1 to stop input): \n')
while True:
    data_point = input('\nEnter a data point (-1 to stop input): \n')
    if data_point != '-1':    
        dp = data_point.split(',')
        if len(dp) > 2:
            print("Error: Too many commas in input.")
    
        elif len(dp) < 2:
            print("Error: No comma in string.")
    
        elif len(dp) == 2:
            try:
                dp[1] = int(dp[1])
                print("Data string:",dp[0])
                print("Data integer:",dp[1])
                name = dp[0]
                num = str(dp[1])
            
                tc.append(dp)
                
            except ValueError:
                print("Error: Comma not followed by an integer.")
    else:    #if data_point == '-1':
        break
chart(title, header1, header2)
novels()       
        
#print(chart(title,header1,header2,))





