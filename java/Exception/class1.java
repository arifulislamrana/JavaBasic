
package Exception;

public class class1 {
    public static void main(String[] args) {
        
        try{
            int x=10;
            int y=0;
            int result=x/y;
            System.out.println("Result: "+result);
        }catch(ArithmeticException e ){
            System.out.println("exception: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e1 ){
            System.out.println("exception: "+e1);
        }
        finally{
             System.out.println("last line of the program");//exception type vul holeo eta kaj korbe
        }
        
       
    }
}
