/**
 * 
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20031107, 21 Apr 2021 3:06:11 pm
 */

public class FirstSchDay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime firstDayOfSch = LocalDateTime.of(2019, 4, 15, 9, 15);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" EEEE dd MMMM yyyy, hhmm a");

		System.out.println("The first day of school is on " + firstDayOfSch.format(formatter));

	}

}
