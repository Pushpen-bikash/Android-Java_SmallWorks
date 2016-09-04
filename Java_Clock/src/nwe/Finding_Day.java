package nwe;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Finding_Day {

	public static void main(String args[])
	{
        try {
        	Scanner sc = new Scanner(System.in);
        	
      	  String input_date="11/08/2";
      	  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
      	  java.util.Date dt1=  format1.parse(input_date);
      	  DateFormat format2=new SimpleDateFormat("EEEE"); 
      	  String finalDay=format2.format(dt1);
      	  System.out.println(finalDay);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
