
package Chapt_9;

import java.util.Scanner;


public class SelectionSort {
    
     static void sort(int arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
            System.out.println("pass: "+(i+1));
            for (int j = 0; j < n; j++) {
             System.out.print(+arr[j]+" ");
         }
                System.out.println("");
        }
    }
     public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        
        int n;
        System.out.print("Enter the size of array: ");
        n = in.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter all the elements one by one");
         for (int i = 0; i < n; i++) {
             
             array[i] = in.nextInt();
         }
         
         sort(array);
         
         System.out.println("sorted array:");
         for (int i = 0; i < n; i++) {
             
             System.out.print(+array[i]+" ");
         }
 
    }
    
}
