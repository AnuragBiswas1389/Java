
package java_callender_class;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;



public class Java_callender_class {

    public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);
       
       int year=0, month=0, day=0;
       
       
       System.out.println("day,month, year");
       
       
       day = input.nextInt();
       month = input.nextInt(); 
       year = input.nextInt();
       
       
    Calendar calendar = Calendar.getInstance();
    
    calendar.set(Calendar.YEAR,year);
    calendar.set(Calendar.MONTH,month-1);
    calendar.set(Calendar.DAY_OF_MONTH,day);
    
    int da = calendar.get(Calendar.DAY_OF_WEEK);
    
    System.out.println(da);
    
    System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US));
   
    
    
     
            
    }
    
    
        
        
    }
    

