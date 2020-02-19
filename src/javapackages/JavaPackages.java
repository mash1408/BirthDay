
package javapackages;

import birthDayCalender.BirthDay;
 
public class JavaPackages {

    public static void main(String[] args){
        BirthDay x= new BirthDay();
         x.getBirthDay();
         System.out.println("You are "+x.daysUntilBirth()+" days old");
         if(!x.isAfter())
         System.out.println("unti your next birthday "+x.daysUntilNextBirthDAY());
         else
         {
             System.out.println(" Days AFteryour birthday "+x.daysAfterNextBirthDAY());
         }
    }
    
}
