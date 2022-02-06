package javaapplication2;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ASUS
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();
        
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + gcal.get(Calendar.YEAR));
        System.out.println("Month is " + gcal.get(Calendar.MONTH));
        System.out.println("Date is " + gcal.get(Calendar.DATE));
        System.out.println("Day of week is " + gcal.get(Calendar.DAY_OF_WEEK));

        gcal.add(Calendar.DATE, 1);

        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + gcal.get(Calendar.YEAR));
        System.out.println("Month is " + gcal.get(Calendar.MONTH));
        System.out.println("Date is " + gcal.get(Calendar.DATE));
        System.out.println("Day of week is " + gcal.get(Calendar.DAY_OF_WEEK));
        System.out.println(gcal.getTime());
    }
    
}
