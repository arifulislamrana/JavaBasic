
package Practice;

import java.security.SecureRandom;

public class bubbleSort {
    public static void printarr(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(+array[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        SecureRandom s = new SecureRandom();
        int n=10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt(100);
        }
        System.out.print("Current Array is: ");
        printarr(arr);
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print("pass"+(i+1)+": ");
            printarr(arr);
        }
        
        System.out.print("Sorted Array: ");
        printarr(arr);
    }
}
