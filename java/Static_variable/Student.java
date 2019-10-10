//video no:89,90,91
package Static_variable;

public class Student {
    
    String name;
    int id;
    static String  universityname="PUST";
    
    Student(String n ,int i){
    name=n;
    id=i;
    }
    
    void display(){
        
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University_Name:"+universityname);
    }
    
}
    
    
