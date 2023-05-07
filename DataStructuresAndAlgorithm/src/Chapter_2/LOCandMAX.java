package Chapter_2;


/**
 *
 * @author arif
 */
public class LOCandMAX {
    
    public static void main(String[] args) {
        
        int data[]={22,65,1,99,32,17,74,49,33,2};
        
        int N, LOC, MAX, k;
        N = 10;
        k = 0;
        LOC = 0;
        MAX = data[0];
        
        for (k = k+1; k < N; k++) {
            if (MAX<data[k]) {
                MAX = data[k];
                LOC = k;
            }
            if (k==N-1) {
                System.out.println("LOC = "+LOC+", MAX = "+MAX);
            }
        }
        
    }
}
