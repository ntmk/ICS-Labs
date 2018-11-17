itemName = input('Enter food item name: \n')
price = float(input('Enter item price: \n'))
quantity = int(input('Enter item quantity: \n'))
hotdog = (quantity * price)

print('\nRECEIPT')
print(quantity,itemName,'@ $',price,'= $',hotdog)
print('Total cost: $',hotdog)
print('\n')

item = input('Enter second food item name: \n')
prices = float(input('Enter item price: \n'))
quantitys = int(input('Enter item quantity: \n'))
icecream = (quantitys * prices)

print('\nRECEIPT')
print(quantity,itemName,'@ $',price,'= $',hotdog)
print(quantitys,item,'@ $',prices,'= $',icecream)
print('Total cost: $',icecream + hotdog)

gratuity = (hotdog + icecream) * .15
print('\n15% gratuity: $',gratuity)
print('Total with tip: $',hotdog + icecream + gratuity)

# FIXME (1): Finish reading item price and quantity, then output a receipt
   
# FIXME (2): Read in a second food item name, price, and quantity, then output a second receipt
   
# FIXME (3): Add a gratuity and total with tip to the second receipt