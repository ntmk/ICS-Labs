print ('Enter arrow base height: ')
arrow_base_height = int(input())
   
print ('Enter arrow base width: ')
arrow_base_width = int(input())

print ('Enter arrow head width: ')
arrow_head_width = int(input())
while arrow_head_width <= arrow_base_width:
    print ('Enter arrow head width: ')
    arrow_head_width = int(input())
    

for i in range(arrow_base_height):
    for i in range(arrow_base_width):
        print('*', end='')
    print('')

while arrow_head_width > 0:
    print(arrow_head_width*'*')
    arrow_head_width -= 1