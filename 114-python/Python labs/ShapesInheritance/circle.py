from ellipse import Ellipse
import math

class Circle(Ellipse):
    def __init__(self, centre_x, centre_y, radius,name = 'Circle'):
        Ellipse.__init__(self, centre_x, centre_y,radius, radius, name)
        
    def __str__(self):
        return ('%s: (%d, %d), area=%.2f, r=%d' % (self.name, self.centre_x, self.centre_y,Ellipse.area(self), self.radius_x))