
package Static_variable;


public class TEST {
    
    public static void main(String[] args) {
        Student s1= new Student("arif",170632);
        s1.display();
        System.out.println("name:"+Student.universityname);//using static variable without creating object
    }
    
}/*
staic variable use korte object creat kora lage na
System.out.println("University_Name:"+Student.universityname);
it means classname.variablename

*/
