
package Inheritence;


public class inherit_private_teacher extends inherit_private_person {
    //it has all the public methode of person classs
    private String qualifiaction;

    public String getQualifiaction() {
        return qualifiaction;
    }

    public void setQualifiaction(String qualifiaction) {
        this.qualifiaction = qualifiaction;
    }
    void display2(){
        display1();
        System.out.println("qualification:"+qualifiaction);
    }
}
