
package Basic_java;

import java.util.Scanner;



public class Prime_number {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i,m,n,count=0,isprime=0,j;
        System.out.println("enter initial number : ");
        m =input.nextInt();
         System.out.println("enter final number : ");
        n =input.nextInt();
        
        System.out.println("PRime numbers are  :");
        
        for(i=m;i<=n;i++){
            if(i==1)
                count++;
            for(j=2;j<i;j++){
                if(i%j==0){
                count++;
                break;
            }
               
            }
            
                if(count==0){
                isprime++;
                    System.out.println(i);
            }
             
             count=0;
        }
        System.out.println("total prime number = "+isprime);
       }
     
    
}
