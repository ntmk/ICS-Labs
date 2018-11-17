# FIXME (1): Prompt for four weights. Add all weights to a list. Output list.
w1 = float(input('Enter weight 1: '))
w2 = float(input('\nEnter weight 2: '))
w3 = float(input('\nEnter weight 3: '))
w4 = float(input('\nEnter weight 4: \n'))
weight = [w1, w2, w3, w4]
print('\nWeights:',weight)
# FIXME (2): Output average of weights.
average = sum(weight) / 4
print('Average weight:',average)
# FIXME (3): Output max weight from list.
print('Max weight:',max(weight))
# FIXME (4): Prompt the user for a list index and output that weight in pounds and kilograms.
i = int(input('\nEnter a list index (1 - 4): '))

if i == 1:
    pounds = weight[0]
if i == 2:
    pounds = weight[1]
if i == 3:
    pounds = weight[2]
if i == 4:
    pounds = weight[3]

print('\nWeight in pounds:',pounds)
kilograms = pounds / 2.2
print('Weight in kilograms:',kilograms)
# FIXME (5): Sort the list and output it.
print('\nSorted list:',sorted(weight))