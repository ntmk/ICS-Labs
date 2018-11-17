package lab1;
/**
 * Retrieve the sum of multiples, finds the least common multiple and 
 * the greatest common divisor from given numbers.
 * @author Nathan Mackenzie
 * @ version 1.0
 * @ since 1.0
 * 
 */
public class Multiples {
    
    private int x;
    
    /**
     * Set the variable x to an integer stored in m
     * @param m is assigned the int value assigned to x
     * @ Throws Illegal Argument Exception if value is less than 0
     * 
     */
    public Multiples(int m){
        x = m;
        if (x <= 0)
            throw new IllegalArgumentException("Argument must be > 0.");
    }

    /**
     * Returns the Value of x
     * @return Returns the int x value
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Sums the multiple of passed numbers and returns the result
     * @param max The highest value loop will excecute to
     * @return Returns the sum of all valid multiples
     * Passes the max value to ensure the loop ends 
     * 
     */
    public int sumMultiplesUpTo(int max) {
        int sum = 0;
        for (int i = 0; i < max; i++){
            if (i % x == 0){
                sum += i;
                }
        }
        return sum;
        
    }

    /**
     * Passes the value of y and calculates the greatest common divisor
     * @param y passes int type y as a parameter for greatest common divisor
     * @return Returns the greatest common divisor that is stored in variable x
     * 
     */
    public int greatestCommonDivisor(int y) {
        
        x = Math.abs(x);
        y = Math.abs(y);
       
        while (x > 0){
            if (y == 0){
                return x;
                        }
            int remainder = x % y;
            x=y;
            y = remainder;
            
            }
        return x;
        }
   
    /**
     * Passes the value of y calculates the least common denominator
     * @param y takes int y as a parameter
     * @return Returns the least common multiple
     * @ Throws Illegal Argument exception if both numbers are non zeros
     * 
     */
    public int leastCommonMultiple(int y) {
        if (y == 0)
            throw new IllegalArgumentException("Can only be defined if both are non zero.");
        
        int lcm = Math.abs(x * y);
        int lcm2 = greatestCommonDivisor(y);
        return lcm / lcm2;
    }
}

