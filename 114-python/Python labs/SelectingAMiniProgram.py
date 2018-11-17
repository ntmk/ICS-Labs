import math

def program1(base, height):
    area = 0.5 * base * height
    return area
    
def program2 (a,b):
    c=(a*a)+(b*b)
    return math.sqrt(c)
    
def program3 (radius):
    area=math.pi*radius**2
    return area

def program4 (numerator, denominator):
    (numerator//denominator)
    (numerator%denominator)
    (numerator/denominator)
    return numerator, denominator
    
def program5 (p, r, t):
    month=((p*r*(1+r)**t)/((1+r)**t-1))
    return month
# ...


# Place your main program here. This is where your program will begin execution
# because everything above it is just inside "def" blocks.
choice = input("Enter the program to run: ")

import math
if choice == "P1":
    base=float (input())
    height=float (input())
    area=0.5*(base*height)
    print("The answer is: %.1f" % area)

if choice == "P2":
    import math
    a=float(input())
    b=float(input())
    c=(a*a+b*b)
    print("The answer is: %.2f" % math.sqrt(c))

if choice == "P3":
    import math
    math.pi
    radius= float(input())
    area=math.pi*radius**2
    print("The answer is: %.3f" % area)

if choice == "P4":
    import math
    numerator=int(input())
    denominator=int(input())
    print("The answer is: %.0f" % (numerator//denominator))
    print("The answer is: %.0f" % (numerator%denominator))
    print("The answer is: %.1f" % (numerator/denominator))



if choice == "P5":
    p=int(input())
    r=float(input())
    t=int(input())
    r=r/12
    t=t*12
    month=((p*r*(1+r)**t)/((1+r)**t-1))
    print("The answer is: %.2f" % month)