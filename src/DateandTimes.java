// imports needed for date. time, and format
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
public class DateandTimes {

  public static void main(String[] args) {
    //next full moon is 3/1/2018


    Calendar today = Calendar.getInstance();                      //set today's date
    SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy");//format date output
    String currentDate = sdf.format(today.getTime());             //convert today's date to a string
    System.out.println("Today is " + currentDate);


    Calendar calendar = new GregorianCalendar(2018, Calendar.MARCH, 1, 17,52); //set date for next full moon
    String date = sdf.format(calendar.getTime());
    System.out.println("The next full moon will occur on " + date);                        //print date for next full moon

    calendar.add(Calendar.DAY_OF_MONTH, 29); //add to the date object to determine the next full moon
    calendar.add(Calendar.HOUR, 12);
    calendar.add(Calendar.MINUTE, 44);
    date = sdf.format(calendar.getTime());
    System.out.println("Another full moon will occur on " + date);                        //print date for another full moon
    }
  }