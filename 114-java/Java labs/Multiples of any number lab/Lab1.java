package lab1;
import java.util.Scanner;
/*
 * @author Nathan Mackenzie
 */

/**
 *
 * @author Nathan Mackenzie
 */

public class Lab1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Multiples m3 = new Multiples(3);
        Multiples m5 = new Multiples(5);
        Multiples common = new Multiples(m3.leastCommonMultiple(5));
        
        int lab1Solution = m3.sumMultiplesUpTo(1000) + m5.sumMultiplesUpTo(1000) - common.sumMultiplesUpTo(1000);
        System.out.println(lab1Solution);
        
        int gcd = m3.greatestCommonDivisor(81);
        System.out.println(gcd);
        
        gcd = common.greatestCommonDivisor(20);
        System.out.println(gcd);
        
        Multiples m = new Multiples(42);
        gcd = m.greatestCommonDivisor(70);
        System.out.println(gcd);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer between 1 - 1000: ");
        int x = sc.nextInt();
        Multiples m1 = new Multiples(x);
        
        System.out.println("Enter the next integer between 1 - 1000: ");
        int y = sc.nextInt();
        Multiples m2 = new Multiples(y);
        
        int lcm = m1.leastCommonMultiple(y);
        
        Multiples mCommon = new Multiples(lcm);
        
        long sum = m1.sumMultiplesUpTo(1000) + m2.sumMultiplesUpTo(1000) - mCommon.sumMultiplesUpTo(1000);
        System.out.println(sum);
    }
}
    
    

