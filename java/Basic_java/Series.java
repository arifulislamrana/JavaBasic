
package Basic_java;

import java.util.Scanner;


public class Series {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       int n,sum=0;
       
       System.out.println("EnTer tHe VaLuE of N: ");
       n = input.nextInt();
       
       for(int i=1; i<=n; i++){
           sum = sum + i*i;
       }
       
       System.out.println("sum is = "+sum);
        
    }
}
