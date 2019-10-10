
package Basic_java;

import java.util.Scanner;


public class Armstrong_number {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    int num,sum=0,i,b;
    
    num=input.nextInt();
    
    for(i=num;i>0;i=i/10){
        b=num%10;
        sum=sum+b*b*b;
    }
    if(sum==num){
        System.out.printf("armstrong");
    }else{
        System.out.printf("not armstrong\n");
    }   
    
     
    }
    
    
}
