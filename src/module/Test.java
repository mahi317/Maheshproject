package module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		
    	SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
    	String startDate = "2022-11-18";
    	String endDate = "2023-11-17";
        try {
			Date d1 = sdf.parse(startDate);
			Date d2 = sdf.parse(endDate);
			int diffdays = d2.getDay()-d1.getDay()+ 1;
			System.out.println("diff : " + diffdays);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}

	
	

	}

}
