

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * Wei_An, 21 Apr 2021 10:17:00 am
 */

public class TemperatureConversion {

	public static void main(String[] args) {	
		
		double celsius = 0.0;
		double fahrenheit = 0.0;
		String msg = null;
		
		int option = 0;
		
		while (option != 3) {
		Helper.line(30,"-");
		System.out.println("TEMPRATURE CONVERSION");
		Helper.line(30,"-");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		System.out.println ("3. Quit");
		
		option = Helper.readInt("Enter an option");
		
		
		
		if(option == 1) {
		celsius = Helper.readDouble("Enter a temperature in celsius > ");
		fahrenheit = (celsius * 1.8) + 32;
		msg = String.format("%.2f degree Celsius is %.2f degrees Fahrenheit", celsius,fahrenheit);
		
		System.out.println(msg);
		}
	
		else if(option == 2) {
		fahrenheit = Helper.readDouble("Enter a temperature in fahrenheit > ");
		celsius = (fahrenheit -32)/ 1.8;
		msg = String.format("%.2f degree Fahrenheit is %.2f degrees Celsius", fahrenheit,celsius);
		
		System.out.println(msg); 
		}
		
		else if(option == 3 ) {
			System.out.println ("Good bye!");
		}
		
		else {
			System.out.println("Invalid option entered");
		}
	}
	}
}

