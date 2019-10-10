
package File;

import java.io.File;


public class Creat {
    public static void main(String[] args) {
        File dir = new File("person");
        dir.mkdir();//create directory
        String dirlocation =dir.getAbsolutePath();//location of directory
        /*
        System.out.println("Directory location: "+dirlocation);
        if(dir.delete()){
            System.out.println(dir.getName()+" directory has been deleted");
        }*/
        File file1=new File(dirlocation+"/student.txt");//dirlocation =dir.getAbsolutePath();
        File file2=new File("E:/Software/java/Bismillah/person/teacher.txt");
        try{
           file1.createNewFile();
           file2.createNewFile();
            System.out.println("files are created");
        }catch(Exception e){
            System.out.println(e);
        }
        //file1.delete();
        if(file1.exists()){
            System.out.println("file already exist");
        }else{
            System.out.println("file doesnt exist");
        }
    }
}
