
package Basic_java;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        
        int i,j,l;
        
        Scanner input = new Scanner(System.in);
        //System.out.printf("entar the value of N : ");
        
        //l = input.nextInt();
         
        for(i=1;i<=10;i++){
            for(j=1;j<=10;j++){
                System.out.printf("%4d",j*i);
            }
            System.out.println();
        }
        
    }
}
