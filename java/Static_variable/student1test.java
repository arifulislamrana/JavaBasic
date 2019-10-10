
package Static_variable;


public class student1test {
    
    public static void main(String[] args) {
        student1 s1=new student1();
        s1.totalstudent();
        student1 s2=new student1();
         s2.totalstudent();
        student1 s3=new student1();
        s3.totalstudent();
        student1 s4=new student1();
        s4.totalstudent();//if the count variable wasnt static then output will alwayas show "total student:1"   
    }
    
}
