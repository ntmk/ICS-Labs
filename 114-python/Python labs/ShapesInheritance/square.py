from rectangle import Rectangle
import math

class Square(Rectangle):
    def __init__(self, centre_x, centre_y, side, name ='Square'):
        Rectangle.__init__(self, centre_x, centre_y, side, side, name)
            
    def __str__(self):
        return ('%s: (%d, %d), area=%.2f, s=%d' % (self.name, self.centre_x, self.centre_y, Rectangle.area(self), self.width))
        