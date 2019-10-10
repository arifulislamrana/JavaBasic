
package Keywords;


public class Super_test extends Super {
    int x=4;
    @Override
    void display(){
        super.display();
        System.out.println("inside super_test class");
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        Super_test ob=new Super_test();
        ob.display();
    }
        
    
}
