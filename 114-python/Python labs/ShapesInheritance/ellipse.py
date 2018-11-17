from shape import Shape
import math

class Ellipse(Shape):
    def __init__(self, centre_x, centre_y, radius_x, radius_y, name = 'Ellipse'):
        Shape.__init__(self, centre_x, centre_y, name)
        self.radius_x = radius_x
        self.radius_y = radius_y 

    def area(self):
        area = math.pi * self.radius_x * self.radius_y
        return float(area)
        
    def __str__(self):
        return ('%s: (%d, %d), area=%.2f, rx=%d, ry=%d' % (self.name, self.centre_x, self.centre_y, self.area(), self.radius_x, self.radius_y))
            
            #- overrides the superclass method to also add the following, after the area: ", rx=RX, ry=RY", where RX is the radius along the x-axis, and RY is the radius along the y-axis.