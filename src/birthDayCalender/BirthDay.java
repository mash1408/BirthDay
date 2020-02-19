
package birthDayCalender;
import java.util.Date;
import java.util.Calendar; 
import java.util.Scanner;
import java.lang.Math;

public class BirthDay{
    Calendar yourBirth;
  
    Calendar today(){
        Calendar today = Calendar.getInstance();  
        return today;
    }
    public BirthDay(){
        yourBirth=Calendar.getInstance();
    }
    public void getBirthDay(){
        int day,month,year;
        Scanner getDate=new Scanner(System.in);
        System.out.println("day:");day=getDate.nextInt();
        System.out.println("month:");month=getDate.nextInt();
        month--;
        System.out.println("year:");year=getDate.nextInt();
        yourBirth.set(year,month,day);
        System.out.println("Your BIrthDay:"+yourBirth.getTime());
        
    }
    
     public long dayDifference(Calendar x1, Calendar x2){
        long miliSecondForx1 = x1.getTimeInMillis();
		long miliSecondForx2 = x2.getTimeInMillis();
                long diffInMilis = miliSecondForx2 - miliSecondForx1;
        long diffInDays = diffInMilis / (24 * 60 * 60 * 1000);
        return Math.abs(diffInDays);
    }
   public long daysUntilNextBirthDAY(){
        Calendar temp= yourBirth;
        temp.set(Calendar.YEAR, today().get(Calendar.YEAR));
         return dayDifference(temp,today());
      }
   public long daysAfterNextBirthDAY(){
        Calendar temp= yourBirth;
        temp.set(Calendar.YEAR, today().get(Calendar.YEAR));
         return dayDifference(temp,today());
      }
  public  boolean isAfter()
    {Calendar temp= yourBirth;
      temp.set(Calendar.YEAR, today().get(Calendar.YEAR));
        return today().after(temp);
    }
    
   public long daysUntilBirth(){
        
        return dayDifference(yourBirth,today());
       }
}

