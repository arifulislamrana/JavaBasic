
package Static_block;

public class staticblock {
    static int id;
    static String name;
    
    static{
        id=170632;
        name="ARif";
    }
    static void display(){
        System.out.println("id: "+id);
        System.out.println("name :"+name);
    }
}
