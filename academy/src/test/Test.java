package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	   public static void main(String args[]) throws ParseException {
	      String date = "17-11-2016";
	        
	  
	      SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	      Date dayWeek = null;
	     
	       dayWeek = format.parse(date);
	      
	    
	      System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
	   }
	}