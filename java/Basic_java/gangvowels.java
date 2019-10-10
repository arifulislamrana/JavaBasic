
package Basic_java;

import java.util.Scanner;


public class gangvowels {
    public static void main(String[] args) {
        
    char line;
   
     Scanner de = new Scanner(System.in);
 

    System.out.printf("Enter a character: \n");
    line = de.next().charAt(0);

   
        if(line=='a' || line=='e' || line=='i' ||
           line=='o' || line=='u' || line=='A' ||
           line=='E' || line=='I' || line=='O' ||
           line=='U')
        {
            System.out.printf("vowel\n");
        }
        else if((line>='a'&& line<='z') || (line>='A'&& line<='Z'))
        {
            System.out.printf("consonant \n");
        }
        else if(line>='0' && line<='9')
        {
             System.out.printf("digit\n");
        }
        else{
            System.out.printf("this is sign or special character\n");
        }
    

    
    }
}
