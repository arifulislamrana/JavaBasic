
package Keywords;

public class This {
    String name;
    int age;
    String haircolor;
    This(String name, int age){
        this.name=name;
        this.age=age;
    }
    This(String name,int age,String haircolor){
        this(name,age);
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("haircolor: "+haircolor);
    }
}


