
package Practice;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class pro4 {
    public static void out(int[] x){
        int l=x.length;
        for (int i = 0; i < l; i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SecureRandom r = new SecureRandom();
            int n = 10;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = r.nextInt(100);
            }
            Arrays.sort(arr);
            System.out.print("Array: ");
            out(arr);
            System.out.println();
            Scanner in = new Scanner(System.in);
            System.out.print("Enter element for searching: ");
            int num = in.nextInt();
            int temp = 0;
            int left=0;
            int right = arr.length-1;
            for(left=0; left<=right; ){
                int middle=left+(right-left)/2;
                if(arr[middle]==num){
                    temp=middle+1;
                    System.out.println("found");
                    break;
                }
                if (arr[middle]>num) {
                    right=middle-1;
                }
                if (arr[middle]<num) {
                    left=middle+1;
                }
                
            }
            if (temp==0) {
                System.out.println("not found");
        }
        
    }
}
