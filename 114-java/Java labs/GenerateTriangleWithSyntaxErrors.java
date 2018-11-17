/*
        Generate Triangle For a Given Number
        Generate a triangle of numbers given a triangle height and an increment.
*/
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class GenerateTriangleWithSyntaxErrors{
       
        public static void main (String[] args) throws Exception{
               
                BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));
               
                System.out.print("Enter the height of the triangle:");
                int triangleHeight = Integer.parseInt(keyboard.readLine());
				
                System.out.print("Enter an integer increment:");
                int increment = Integer.parseInt (keyboard.readLine());
                 
                int y = 0;
               
                for(int i=0; i<= triangleHeight; i++){
                       
                        for(int j=1; j <= i; j++){
                                System.out.print(y + '\t');
                                y = y + 1;
                        }
                       
                        System.out.println("");
                }
        }
}