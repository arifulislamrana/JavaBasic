
package Basic_java;

import java.util.Scanner;

public class Bitwise_operator {
    public static void main(String[] args) {
        Scanner de = new Scanner(System.in);
        int a=64,b=16,c,d,e,g,f;
        c=a&b;
        d=a|b;
        e=a^b;
        f=a>>3;
        g=b<<1;
        System.out.printf("c=%d d=%d e=%d f=%d g=%d\n ",c,d,e,f,g);
     
        
    }
}
