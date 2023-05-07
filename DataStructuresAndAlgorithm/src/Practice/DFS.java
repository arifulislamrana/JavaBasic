
package Practice;


public class DFS {
    
     public int v;
     public int[][] mat;
     public int visit[];
     public DFS(int vertex){
         v = vertex;
         mat= new int[v][v];
         visit = new int[v];
         
         for (int i = 0; i < v; i++) {
             visit[i] = 0;
             for (int j = 0; j < v; j++) {
                 mat[i][j] = 0;
             }
         }
     }
     
     
     public void edge(int from, int to){
         mat[from][to] = 1;
     }
     public void adjmat(){
         System.out.println("Adjacent Matrix:");
         for (int i = 0; i < v; i++) {
             for (int j = 0; j < v; j++) {
                 System.out.print(mat[i][j]+" ");
             }
             System.out.println();
         }
     } 
     public void search(int i){
         System.out.print(i+" ");
         visit[i]=1;
         for (int j = 0; j < v; j++) {
             if(visit[j]==0&&mat[i][j]==1){
             search(j);
         }
         }
     }
    
    
    public static void main(String[] args) {
        DFS dfs = new DFS(4);
        
        
        dfs.edge(0,1);
        dfs.edge(0,2);
        dfs.edge(0,3);
        dfs.edge(1,0);
        dfs.edge(2,0);
        dfs.edge(2,3);
        dfs.edge(3,0);
        dfs.edge(3,2);
        
        dfs.adjmat();
        
        System.out.print("DFS: ");
        dfs.search(2);
        
    }
}
