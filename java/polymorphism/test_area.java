
package polymorphism;


public class test_area {
    public static void main(String[] args) {
        shape s=new shape();
        rectangle r =new rectangle(10,20);
        triangle t =new triangle(10,20);
        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
        
        //dynamic dispatch/dynamic binding
        shape s1=new shape();
        shape s2 =new rectangle(10,20);
        shape s3 =new triangle(10,20);
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
        
        //using array
        shape[] s4 = new shape[3];
        s4[0]=new shape();
        s4[1]=new rectangle(10,20);
        s4[2]=new triangle(10,20);
        for(int i=0;i<3;i++){
           System.out.println(s4[i].area()); 
        }
    }
}
