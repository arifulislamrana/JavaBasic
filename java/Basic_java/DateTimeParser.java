/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic_java;
import java.*;
/**
 *
 * @author arif
 */
public class DateTimeParser {
    
     public static void main(String[] args){
      
      String s="2019-03-28",t="14:26";
    int day,month,year,hour,min;
    year=Integer.valueOf(s.substring(0,4));
        month=Integer.valueOf(s.substring(5,7));
    day=Integer.valueOf(s.substring(8,10));
       hour=Integer.valueOf(t.substring(0,2));
    min=Integer.valueOf(t.substring(3,5));


    System.out.printf("%d/%d/%d",day,month,year);
        System.out.printf("%d:%d",hour,min);

    }
    
}
