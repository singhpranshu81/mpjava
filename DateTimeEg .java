package baba;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeEg {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		
		DateTimeFormatter fr=DateTimeFormatter.ofPattern("dd-MM-yyyy"); // or dd-MM-yyyy HH:mm:ss
		String format= currentDate.format(fr);
		System.out.println("Current date: "+format);
		// current time
		LocalTime localTime = LocalTime.now();
		System.out.println("curent time: "+localTime);
		
		LocalDateTime l=LocalDateTime.now();
		System.out.println("curent date and time: "+l);
		
		//specific date
		LocalDate s=LocalDate.of(2024,Month.AUGUST, 20);
		System.out.println("local date: "+s);
		//specific time
		LocalTime t=LocalTime.of(11,30,45);
		System.out.println("specific time: "+t);
		
		LocalDateTime j=LocalDateTime.of(2024,Month.AUGUST, 20,11,30,45);
		System.out.println("specific date and time: "+j);
		
		LocalDate nextweek= currentDate.plusWeeks(1); // similarly .minusMonths(2),minusYears(1),time.plusHours(1),time.plusMinutes(5),
		System.out.println("next week is : "+nextweek);
		//ZoneDateTime z=ZoneDateTime.now(ZoneId.of("Asia/Kolkata"));
		LocalDate a=LocalDate.of(2012,6,30);
		LocalDate b=LocalDate.of(2012,7,30);
		System.out.println(a.isBefore(b));
		System.out.println(b.isBefore(a));
		//   isBefore(date) , isAfter(date)
		
		//convert string to a date
		String dt="20-05-2025";
		LocalDate parsdt= LocalDate.parse(dt,fr);
		System.out.println("Prased  date: "+parsdt);
	}

}
