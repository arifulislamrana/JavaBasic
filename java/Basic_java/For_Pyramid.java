
package Basic_java;

public class For_Pyramid {
    static void draw()
    {
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
