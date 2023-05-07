
package Chapt_9;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class SelectionSortFromFile {
    
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
            
        }
    }
    
    
    
    
    public static void main(String[] args) {
        try{
            File a=new File("C:/Users/arif/Desktop/in.txt");
            Scanner input=new Scanner(a);
             int n, i=0;
             int[] array = new int[10000];
             while(input.hasNext()){
                n=input.nextInt();
                System.out.println(+n+" ");
                array[i] = n;
                i++;
            }
            int l = i;
             sort(array);
                
                System.out.println("sorted array: ");
                for (int k = 0; k < l; k++){
                System.out.print(+array[k]+" ");
                 }
            input.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
     
    
}
