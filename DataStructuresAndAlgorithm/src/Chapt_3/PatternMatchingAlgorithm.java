//pattrern matching algorithm
package Chapt_3;

import java.util.Scanner;

/**
 *
 * @author arif
 */
public class PatternMatchingAlgorithm {
    public static int substring(String str, String s){
        
        int l = str.length();
        int l2 = s.length();
        
        int i,j;
        
        char[] ms = str.toCharArray();
        char[] sb = s.toCharArray();
        
        for (i = 0; i < (l-l2)+1; i++) {    
            int k = i;
            for (j = 0; j < l2; j++) {
                if (ms[k] != sb[j]) {
                    break;
                }
                k++;
            }
            if (j ==l2) {
                return(i);
            }
        }
        return(-1);
    }
    
    public static void main(String[] args) {
        
        String str,s;
        
        Scanner de = new Scanner(System.in);
        
        str = de.nextLine();
        s = de.nextLine();
        
        int f;
        f = substring(str, s);
        //System.out.println(f+1);
        if (f == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("String match from "+(f+1)+" to "+(f+s.length()));
        }
        
    }
    
}
