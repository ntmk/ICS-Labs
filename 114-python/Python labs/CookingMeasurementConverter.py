lemon=float(input('Enter amount of lemon juice (in cups): \n'))
water=float(input('Enter amount of water (in cups): \n'))
agave=float(input('Enter amount of agave nectar (in cups): \n'))
jug=float(input('How many servings does this make? \n'))

print ('\nLemonade ingredients - yields',jug,'servings')
print (lemon,'cup(s) lemon juice')
print (water,'cup(s) water')
print (agave,'cup(s) agave nectar')

serv=float(input('\nHow many servings would you like to make? \n'))
lemon = ((lemon/6)*serv)
water = ((water/6)*serv)
agave = ((agave/6)*serv)

print ('\nLemonade ingredients - yields',serv,'servings')
print (lemon,'cup(s) lemon juice')
print (water,'cup(s) water')
print (agave,'cup(s) agave nectar')

print ('\nLemonade ingredients - yields',serv,'servings')
print (lemon/16,'gallon(s) lemon juice')
print (water/16,'gallon(s) water')
print (agave/16,'gallon(s) agave nectar')





# FIXME (1): Finish reading other items into variables, then output the three ingrdients
   
# FIXME (2): Prompt user for desired number of servings. Convert and output the ingredients

# FIXME (3): Convert and output the ingredients from (2) to gallons
   
