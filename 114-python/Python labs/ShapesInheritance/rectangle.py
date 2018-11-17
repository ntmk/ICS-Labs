from shape import Shape
import math

class Rectangle(Shape):
    def __init__(self, centre_x, centre_y, width, height, name = 'Rectangle'):
        Shape.__init__(self, centre_x, centre_y, name)
        self.height = height 
        self.width = width

    def area(self):
        area = int(self.width * self.height)
        return area
        
    def __str__(self):
        return ('%s: (%d, %d), area=%.2f, w=%d, h=%d' % (self.name, self.centre_x, self.centre_y, self.area(), self.width, self.height))
        