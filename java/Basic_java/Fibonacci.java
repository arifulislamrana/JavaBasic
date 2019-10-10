
package Basic_java;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int first=0,second=1,fibo,i,n;
        
        System.out.println("how many times u want fibonacci numb:");
        n=input.nextInt();
        
        System.out.printf("%d %d ",first,second);
        for(i=3;i<=n;i++){
            fibo=first+second;
            System.out.printf("%d ",fibo);
             first=second;
             second=fibo;
        }
        System.out.println();
    }
}
