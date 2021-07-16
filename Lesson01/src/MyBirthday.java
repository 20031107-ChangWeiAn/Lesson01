/**
 * 
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20031107, 21 Apr 2021 1:04:58 pm
 */

public class MyBirthday {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate birthDate = LocalDate.of(2003, 10, 7);
		System.out.println(birthDate);

		System.out.println ("I was born in " + birthDate.getDayOfYear());
		System.out.println ("The month that I was born in was: " + birthDate.getMonth());
		System.out.println ("The day I was born in was: " + birthDate.getDayOfWeek());
		
	}

}
