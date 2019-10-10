
package Inheritence;


public class inherit_private_person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display1(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
    }
    
}
