
package Keywords;

public class Final {
    final String university="NU";//final variable
    final int roll;//blank final variable
    static final int fees;//static blank final variable

    public Final() {//to initialize blank final variable
        roll = 17;
    }
    
    static{//to initialize static blank final variable
        fees=17000;
    }
   void display(){
       System.out.println(university);
       System.out.println(roll);
       System.out.println(fees);
   }
    public static void main(String[] args) {
        Final ob =new Final();
        ob.display();
    }
}

