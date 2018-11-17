class ItemToPurchase:
    def __init__(self, item_name="none", item_price=0, item_quantity=0, item_description="none"):
        self.item_name = item_name
        self.item_price = item_price
        self.item_quantity = item_quantity
        self.item_description = item_description
        
    def print_item_cost(self):
        print('%s %d @ $%d = $%d' % (self.item_name, self.item_quantity, self.item_price, self.get_total()))
        
    def get_total(self):
        return self.item_price * self.item_quantity
        
    def print_item_description(self):
        print("%s: %s" % (self.item_name, self.item_description))
        
class ShoppingCart:
    def __init__(self, customer_name="none", current_date="January 1, 2016"):
        self.customer_name = customer_name
        self.current_date = current_date
        self.cart_items = [] 
        
    def add_item(self, item_purchase):
        self.cart_items.append(item_purchase)
        
    def remove_item(self, ItemName):
        isFound = False
        for item in self.cart_items:
            if item.item_name == ItemName:
                isFound = True
                self.cart_items.remove(item)
        if isFound == False:
            print('Item not found in cart. Nothing removed.')
        print()
        
    def modify_item(self, ItemToPurchase):
        isFound = False
        for item in self.cart_items:
            if item.item_name == ItemToPurchase.item_name:
                isFound = True
                if ItemToPurchase.item_description != "none":
                    item.item_description = ItemToPurchase.item_description 
                if ItemToPurchase.item_quantity != 0:
                    item.item_quantity = ItemToPurchase.item_quantity
                if ItemToPurchase.item_price != 0:
                    item.item_price = ItemToPurchase.item_price
                
                #Check to see if paramter has default values for description, price, and quantity. If not, modify item in cart
        #if isFound == False:
        else:
            print('Item not found in cart. Nothing modified.')
            print()
    
    def get_num_items_in_cart(self):
        all_items = 0
        for item in self.cart_items:
            all_items += item.item_quantity
        return all_items #returns quantity of all items in cart. has no parameters
    
    def get_cost_of_cart(self):
        cart_price = 0
        for item in self.cart_items:
            cart_price += item.item_price*item.item_quantity
        return cart_price #Determines and returns the total cost of items in cart. Has no parameters.
    #Good till here so far :)
    def print_total(self):
        print("%s's Shopping Cart - %s" % (shopping_cart.customer_name, shopping_cart.current_date))
        print("Number of Items:", shopping_cart.get_num_items_in_cart())
        print()
        if len(self.cart_items) == 0:
            print("SHOPPING CART IS EMPTY")
        else:
            for item in self.cart_items:
                item.print_item_cost()
        print()        
        print("Total: $%d" % (self.get_cost_of_cart()))
        
            
        
        #Outputs total of objects in cart.
        #If cart is empty, output this message: SHOPPING CART IS EMPTY
    
    def print_descriptions(self):
        print("%s's Shopping Cart - %s" % (shopping_cart.customer_name, shopping_cart.current_date))
        print()
        print("Item Descriptions")
        for item in self.cart_items:
            item.print_item_description()
            
            
        
        #Outputs each item's description
    
        
if __name__ == "__main__":
    
    def print_menu(shopping_cart):
        menu = '''MENU
a - Add item to cart
r - Remove item from cart
c - Change item quantity
i - Output items' descriptions
o - Output shopping cart
q - Quit
\nChoose an option: '''
        menuOp = ''
        print(menu)
        while True:
            menuOp = input()
            if menuOp == 'q':
                break
            
            elif menuOp == 'o':
                print("OUTPUT SHOPPING CART")
                shopping_cart.print_total()
                print()
                print(menu)
                
            elif menuOp == 'i':
                print("\nOUTPUT ITEMS' DESCRIPTIONS")
                shopping_cart.print_descriptions()
                print()
                print(menu)
                
            elif menuOp == 'a':
                print("ADD ITEM TO CART")
                banana = input("Enter the item name: ")
                item_desc = input("\nEnter the item description: ")
                item_price = int(input("\nEnter the item price: "))
                item_quan = int(input("\nEnter the item quantity: "))
                print()
                print()
                item = ItemToPurchase(banana, item_price, item_quan, item_desc)
                shopping_cart.add_item(item)
                print(menu)
                
            elif menuOp == 'r':
                print("REMOVE ITEM FROM CART")
                item_name = input('Enter name of item to remove: ')
                print()
                shopping_cart.remove_item(item_name)
                print(menu)
                
            elif menuOp == 'c':
                print("CHANGE ITEM QUANTITY")
                item_name = input("Enter the item name: \n")
                item_quan = int(input("Enter the new quantity: \n"))
                item = ItemToPurchase(item_name, 0, item_quan)
                shopping_cart.modify_item(item)
                print(menu)
                
            else:
                print("Choose an option: ")
    
    
    cust_name = input("Enter customer's name: ")
    print()
    today_date = input("Enter today's date: ")
    print()
    
    shopping_cart = ShoppingCart(cust_name, today_date)
    print("Customer name:", cust_name)
    print("Today's date:", today_date)
    print()
    print_menu(shopping_cart)