/**
 * 
 */
package C209_L01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20031107, 21 Apr 2021 2:05:18 pm
 */

public class DateTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate); // date that will follow today's date
		
		LocalDate Date = LocalDate.of(2003, 11, 11);
		System.out.println (Date); // date that we type ourself 
		
		System.out.println("day: " +Date.getDayOfMonth()); // getting that day from the date we type
		
		
		LocalTime currentTime = LocalTime.now();
		System.out.println ("time: " + currentTime); //get the time right now
		
		LocalTime Time = LocalTime.of(18, 59, 8);
		System.out.println ("time: " + Time); // get the time that we type
		
		System.out.println("second: " + Time.getSecond());// getting the second from the time we type
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current); //print out the date and the time
		
		LocalDateTime Datetime = LocalDateTime.of(2021,11,11, 20,18,36); // print date first then the time we type
		System.out.println(Datetime);
		
		DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyy");
		String d = "20/11/2000";
		LocalDate dateD = LocalDate.parse(d,ft);
		System.out.println (dateD);
		
		DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("G EEEE yy MM,d");
		String result = dateD.format(ft2);
		System.out.println (result);
		
		

	}

}
