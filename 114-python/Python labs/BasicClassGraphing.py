import math
class Point(object):   
    COUNT = 0 
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def translate(self, dx, dy):
        self.x = self.x + dx
        self.y = self.y + dy
    def __str__(self):
        return ('(%s, %s)' % (self.x, self.y)) 
    
    def __eq__(self, other):
        if self.x == other.x and self.y == other.y:
            return True
        else: 
            return False
        
    def getQuadrant(self):
        if self.x > 0 and self.y > 0:
            return 1
        elif self.x < 0 and self.y > 0:
            return 2
        elif self.x < 0 and self.y < 0:
            return 3
        elif self.x > 0 and self.y < 0:
            return 4
        else:
            return None
        
    def distanceTo(self, other):
        dx = self.x - other.x
        dy = self.y - other.y
        return math.sqrt(dx**2 + dy**2)
           
if __name__ == "__main__":
    
    usr_input = input()
    pairs = usr_input.split()
    list = []
    
    for i in range(0, len(pairs), 2):
        point = Point(int(pairs[i]), int(pairs[i + 1]))
        list.append(point)
    
    output = ''
    output2 = ''
    
    for i in range(len(list) - 1):
        output += str(list[i])+', '
        output2 += str(list[i].getQuadrant())+', '        
    output += str(list[len(list) - 1])
    output2 += str(list[len(list) - 1].getQuadrant())
    
    hasSame = False
    for i in range(len(list)):
        for j in range(i+1, len(list)):
            if list[i] == list[j]:
                hasSame = True
    
    print(output)
    print(output2)
    print('Duplicates:', hasSame)      
          
                
    for i in range(1, len(list) -1):
        distance = list[0].distanceTo(list[i])
        print('%.2f, ' % distance, end='')
    distance = list[0].distanceTo(list[len(list) - 1])    
    print('%.2f' % distance)