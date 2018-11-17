import math

# Program 1
base=float (input())
height=float (input())
area=0.5*(base*height)
print("%.1f" % area)


# Program 2
import math

a=float(input())
b=float(input())
c=(a*a+b*b)
print("%.2f" % math.sqrt(c))

# Program 3
import math

math.pi
radius= float(input())
area=math.pi*radius**2
print("%.3f" % area)


# Program 4
import math

numerator=int(input())
denominator=int(input())
print("%.0f" % (numerator//denominator))
print("%.0f" % (numerator%denominator))
print("%.1f" % (numerator/denominator))



# Program 5
p=int(input())
r=float(input())
t=int(input())
r=r/12
t=t*12
month=((p*r*(1+r)**t)/((1+r)**t-1))
print("%.2f" % month)