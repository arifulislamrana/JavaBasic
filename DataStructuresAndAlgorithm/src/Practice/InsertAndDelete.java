
package Practice;

import java.security.SecureRandom;
import java.util.Scanner;

public class InsertAndDelete {
    public static void printarr(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            System.out.print(+array[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        SecureRandom s = new SecureRandom();
        int n=10;
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt(100);
        }
        System.out.print("Current Array is: ");
        printarr(arr);
        System.out.println("Enter choice: \r\n1.Insert\r\n2.Delete");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice==1) {
            System.out.print("Enter the number: ");
            int num=in.nextInt();
            System.out.print("Enter the index for "+num+":");
            int index = in.nextInt();
            for (int i = 10; i>(index-1); i--) {
                arr[i]=arr[i-1];
            }
            arr[index-1]=num;
            System.out.print("New array is: ");
            printarr(arr);
        }

    }
    
}
