
package File;

import java.util.Formatter;
import java.util.Scanner;

public class write {
    public static void main(String[] args) {
        try{
            Formatter formatter=new Formatter("E:/Software/java/Bismillah/person/student");
            Formatter formatter1=new Formatter("E:/Software/java/Bismillah/person/teacher");
            Scanner input=new Scanner(System.in);
            int n;
            String id,name;
            System.out.println("how many students you have?: ");
            n=input.nextInt();
            for(int i=1;i<=n;i++){
                System.out.print("enter student ID and NAME : ");
                id=input.next();
                name=input.next();
                formatter.format("%s %s\r\n",id,name);
                formatter1.format("roll: %s name: %s\r\n",id,name);
            }
            formatter.close();
            formatter1.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
