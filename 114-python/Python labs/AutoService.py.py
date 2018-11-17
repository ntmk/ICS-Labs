services = { 'Oil change': ('$35'),
             'Tire rotation': ('$19'),
             'Car wash': ('$7'),
        }
oil = input('Enter desired auto service: \n')
print('You entered:', oil)
print()
if oil == 'Oil change' :
    print('Cost of oil change:', services ['Oil change'])
elif oil == 'Tire rotation' :
    print('Cost of tire rotation:', services ['Tire rotation'])
elif oil == 'Car wash' :
    print('Cost of car wash:', services ['Car wash'])
else:
    print('Error: Requested service is not recognized.')