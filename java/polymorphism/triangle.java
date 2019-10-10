
package polymorphism;

public class triangle extends shape {
    double base,hieght;
    
    triangle(double base,double height){
        this.hieght=height;
        this.base=base;
    }
    @Override
    double area(){
        System.out.print("area for triangle: ");
        return (hieght*base*0.5);
    }
}
