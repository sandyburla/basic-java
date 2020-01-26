package Practise;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//public class PractiseJava {
//	
//	public static void main(String[] args) {
//		HashMap<String, String> id = new HashMap<String,String>();
//		String s1 = "there is a will there is a way";
//		String s2 = s1.substring(0, 14);
//		id.put(s2, "123456");
//		
//		HashMap<String, String> id1 = new HashMap<String,String>();
//		id1.put("there is a w", "12-12-12");
//		
//	}
//}

public class PractiseJava{
	public static void main(String[] args) {
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	System.out.println(calendar.get(13));
    String strDateFormat = " MMMMM yyyy ";
    //int x = Integer.parseInt(date);
    DateFormat dateFormat = new SimpleDateFormat(" MMMMM yyyy ");
    String formattedDate= dateFormat.format(date);
   // System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
    //System.out.println("Current time of the day using Date - 12 hour format: " + date.getDay());
	
	}
 }
