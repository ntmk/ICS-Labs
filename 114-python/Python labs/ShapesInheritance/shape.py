import math

class Shape:
    def __init__(self, centre_x, centre_y, name = "Shape"):
        self.centre_x = centre_x
        self.centre_y = centre_y
        self.name = name

    def area(self):
        area = float(-1)
        return area

    def __str__(self):
         return ('%s: (%d, %d), area=%.2f' % (self.name, self.centre_x, self.centre_y, self.area()))
    
    def translate(self, dx, dy):
        self.centre_x = self.centre_x + dx
        self.centre_y = self.centre_y + dy
         
#changes the centre position by dx (in the x-direction) and dy (in the y-direction). Does not have a return value; the effect is to modify the centre_x and centre_y data members.