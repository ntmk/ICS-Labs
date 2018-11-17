from shape import Shape
from rectangle import Rectangle
from square import Square
from ellipse import Ellipse
from circle import Circle

c = Circle(10, 10, 5)
c.translate(7, -4)
print(c)

e = Ellipse(-10, 50, 30, 15)
e.translate(0, 200)
print(e)

s = Square(100, 200, 72)
s.translate(-5, 1)
print(s)

r = Rectangle(25, -212, 13, 42)
r.translate(47, -90)
print(r)