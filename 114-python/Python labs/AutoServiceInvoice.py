# Type your code hereprint('Davy\'s auto shop services')
print('Davy\'s auto shop services')
print('Oil change -- $35')
print('Tire rotation -- $19')
print('Car wash -- $7')
print('Car wax -- $12')
oilChange = 35
tireRotation = 19
carWash = 7
carWax = 12
service1 = input('\nSelect first service: \n')
service2 = input('\nSelect second service: ')
print('\n\n')
message1 = 'Service 1: Oil change, $' + str(oilChange)
message2 = 'Service 2: Car wax, $' + str(carWax)
message3 = 'Service 1: Tire rotation, $' + str(tireRotation)
message4 = 'Service 1: No service'
message5 = 'Service 1: Car wash, $' + str(carWash)
message6 = 'Service 2: Car wash, $' + str(carWash)
message7 = 'Service 2: No service'
totalCost = 0
print('Davy\'s auto shop invoice\n')
if service1 == 'Oil change' :
    print(message1)
    totalCost = totalCost + oilChange
if service1 == '-' :
    print(message4)
if service2 == 'Car wax' :
    print(message2)
    totalCost = totalCost + carWax
if service1 == 'Tire rotation' :
    print(message3)
    totalCost = totalCost + tireRotation
if service1 == 'Car wash' :
    print(message5)
    totalCost = totalCost + carWash
if service2 == 'Car wash' :
    print(message6)
    totalCost = totalCost + carWash    
if service2 == '-' :
    print(message7)
print()
print('Total: $' + str(totalCost))