import math

# Dictionary of paint colors and cost per gallon
paintColors = {
   'red': 35,
   'blue': 25,
   'green': 23,
}
# FIXME (1): Prompt user to input wall's width
# Calculate and output wall area
wallHeight = float(input('Enter wall height (feet): \n'))
wallWidth = float(input('Enter wall width (feet): \n'))
area = wallHeight * wallWidth
gallon = 1 / 350 * area
bucket = math.ceil(gallon)
print('Wall area:', wallHeight * wallWidth, 'square feet')
print('Paint needed:', gallon , 'gallons')
print('Cans needed:', bucket, 'can(s)''\n')
color = input('Choose a color to paint the wall: ')
print('\nCost of purchasing', color, 'paint: $' + (str(paintColors[color ] * bucket)))
   
# FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall

# FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer

# FIXME (4): Calculate and output the total cost of paint can needed depending on color
