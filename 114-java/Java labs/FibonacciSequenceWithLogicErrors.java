/*
        Create, store, and print the first 20 numbers in the Fibonacci Sequence
*/
 
public class FibonacciSequenceWithLogicErrors {

 
        public static void main(String[] args) {
               
                int limit = 20;
               
                long[] series = new long[limit];
               
                series[0] = 0;
                series[1] = series[0];
              
                for(int i=0; i <= limit; i++){
                        series[i] = series[i-1] + series[i-2];
                }
               
                System.out.println("Fibonacci Sequence upto " + limit);
                for(int i=0; i<= limit; i++){
                        System.out.print(series[i] + " ");
                }
        }
}