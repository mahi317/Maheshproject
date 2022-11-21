package module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		
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

	
	
=======
		System.out.println("malli code base - 1");
		System.out.println("mahesh code base");
		System.out.println("mahesh code base - 1");


		System.out.println("malli code base - 2 ");
		
		System.out.println("malli code base - 3 ");
		System.out.println("malli code base - 4 ");

		
>>>>>>> 7240871c986054cb682f0b1b155ad557d027f27e

	}

}
