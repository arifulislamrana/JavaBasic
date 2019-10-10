
package File;

import java.io.File;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        try{
            File a=new File("E:/Software/java/Bismillah/person/student");
            Scanner input=new Scanner(a);
             String id,name;
            while(input.hasNext()){
                id=input.next();
                name=input.next();
                System.out.println("ID: "+id +" name:"+name);
            }
            input.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
