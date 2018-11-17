# Type code for classes here
class ItemToPurchase:
    def __init__(self,item_name = "none"):
        self.item_name = item_name
        self.item_price = 0
        self.item_quantity = 0
        self.total = self.item_price * self.item_quantity
        
    def ptc(self):
        self.total = self.item_price * self.item_quantity
        print('%s %d @ $%d = $%d' % (self.item_name,self.item_quantity,self.item_price,self.total))

if __name__ == "__main__":
    # Type main section of code here
    print('Item 1')
    item1 = ItemToPurchase()
    item1.item_name = str(input('Enter the item name: \n'))
    item1.item_price = float(input('Enter the item price: \n'))
    item1.item_quantity = int(input('Enter the item quantity: \n'))
    
    print('\nItem 2')
    item2 = ItemToPurchase()
    item2.item_name = str(input('Enter the item name: \n'))
    item2.item_price = float(input('Enter the item price: \n'))
    item2.item_quantity = int(input('Enter the item quantity: \n'))
    
    print('\nTOTAL COST')
    item1.ptc()
    item2.ptc()
    
    combined = (item1.item_price * item1.item_quantity) + (item2.item_price * item2.item_quantity)
    print('\nTotal: $%d' % combined)
   