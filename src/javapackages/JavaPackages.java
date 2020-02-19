
package javapackages;

import birthDayCalender.BirthDay;
//class BirthDay{
//    Calendar yourBirth;

//    Calendar today(){
//        Calendar today = Calendar.getInstance();  
//        return today;
//    }
//    BirthDay(){
//        yourBirth=Calendar.getInstance();
//    }
//    void getBirthDay(){
//        int day,month,year;
//        Scanner getDate=new Scanner(System.in);
//        System.out.println("day:");day=getDate.nextInt();
//        System.out.println("month:");month=getDate.nextInt();
//        month--;
//        System.out.println("year:");year=getDate.nextInt();
//        yourBirth.set(year,month,day);
//        System.out.println("Your BIrthDay:"+yourBirth.getTime());
//        
//    }
//    
//    long dayDifference(Calendar x1, Calendar x2){
//        long miliSecondForx1 = x1.getTimeInMillis();
//		long miliSecondForx2 = x2.getTimeInMillis();
//                long diffInMilis = miliSecondForx2 - miliSecondForx1;
//        long diffInDays = diffInMilis / (24 * 60 * 60 * 1000);
//        return Math.abs(diffInDays);
//    }
//    long daysUntilNextBirthDAY(){
//        Calendar temp= yourBirth;
//        temp.set(Calendar.YEAR, today().get(Calendar.YEAR));
//         return dayDifference(temp,today());
//      }
//    long daysAfterNextBirthDAY(){
//        Calendar temp= yourBirth;
//        temp.set(Calendar.YEAR, today().get(Calendar.YEAR));
//         return dayDifference(temp,today());
//      }
//    boolean isAfter()
//    {Calendar temp= yourBirth;
//      temp.set(Calendar.YEAR, today().get(Calendar.YEAR));
//        return today().after(temp);
//    }
//    
//    long daysUntilBirth(){
//        
//        return dayDifference(yourBirth,today());
//       }
//}
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
