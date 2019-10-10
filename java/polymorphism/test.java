
package polymorphism;


public class test {
    public static void main(String[] args) {
        person p=new person();//run time polymorphism/dynamic binding/dynamic dispatch
        p.display();
        p=new teacher();//creating object under super class referenc variable
        p.display();
        p=new student();
        p.display();
    }
}
