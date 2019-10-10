
package Setter_Getter;

public class setter_getter {
    private String name;
    private int age;
    public void setname(String name){//to create setter getter:right click>insert code>select set
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    
    public static void main(String[] args) {
        setter_getter obj=new setter_getter();
        obj.setname("arif");
        obj.setage(22);
        System.out.println(obj.getname());
        System.out.println(obj.getage());
    }
}
