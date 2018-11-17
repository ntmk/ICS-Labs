/* 
 * Program to compute height and velocity of a falling object
 * 
 * Author: Nathan Mackenzie
 * Created on January 16, 2018, 11:59 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>


/*
 * simple method to determine the time, height, and velocity of a falling object
 * with values entered by user
 */
int main(void) {
    
    double height, mass, step, drag, xSectArea, time;
    double g = 9.80667;
    double ad = 1.2754;
    double v = g * 0;
    
    printf("Enter the height in meters: ");
    scanf("%lf", &height);
    
    printf("Enter the mass in kg: ");
    scanf("%lf", &mass);
    
    printf("Enter the drag coefficient: ");
    scanf("%lf", &drag);
    
    printf("Enter the cross-sectional area: ");
    scanf("%lf", &xSectArea);
    
    printf("Enter the time step: ");
    scanf("%lf", &step);
    
    printf("\n%10s %10s %10s", "Time", "Height", "Velocity");
    
    /*run continuous calculations until its height reaches 0*/
    for (double i = 0; (height - v) > 0 && (i < 1,000,000); i++) {
        
        printf("\n%10.1f %10.1lf %10.1lf", time, height, v);
   
        double a = a;
        
        v += a * step;
        
        time += step;

        double fg = mass * g;
        
        double fd = -0.5 * drag * ad * xSectArea * pow(v, 2);
        
        double fnet = fg + fd;
        
        a = fnet / mass;
        
        height = height - v * step;
              
    }
    
    /*Theoretical terminal velocity*/
    double velocity = sqrt((2*mass*g)/(drag*ad*xSectArea));
    printf("\nTheoretical terminal velocity is %.1lf", velocity);
    
    return (EXIT_SUCCESS);
}

