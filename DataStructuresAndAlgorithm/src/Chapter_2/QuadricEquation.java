package Chapter_2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author arif
 */
public class QuadricEquation {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int A, B, C, D;
        double x, x1, x2;
        
        System.out.println("Enter the value of A, B, and C:");
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = B*B - 4*A*C;
        
        if (D>0) {
            
            x1 = ((-1)*B + sqrt(D))/2*A;
            x2 = ((-1)*B - sqrt(D))/2*A;
            
            System.out.println("x1 = "+x1+", x2 = "+x2);
        }
        else if (D==0) {
            x = (-1)*B / 2*A;
        }
        else{
            System.out.println("No real solution.");
        }
    }
}
