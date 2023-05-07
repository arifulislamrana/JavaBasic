
package Practice;

import java.security.SecureRandom;
import java.util.Arrays;

public class prob6 {
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
            System.out.print("Array: ");
            out(arr);
            System.out.println();
            for (int i = 0; i < n; i++) {
                int min=i;
                for (int j = min+1; j < n; j++) {
                    if (arr[min]>arr[j]) {
                        min=j;
                    }
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
        }
            out(arr);
    }
}
