
package Basic_java;

import java.util.Scanner;

public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,r,sum=0,i;
        System.out.println("Enter any integer number:");
        num=input.nextInt();
        while(num>0){
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.printf("sum of digits is= %d\n",sum);
    }
}
