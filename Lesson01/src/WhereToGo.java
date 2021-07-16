
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * Wei_An, 6 Apr 2017 9:26:54 pm
 */

public class WhereToGo {
	public static void main(String[] args) {
		
		ArrayList<Country> countryList = new ArrayList<Country>();
		countryList.add(new Country("Thailand", 26.30, "Food, Massage, Shopping "));
		countryList.add(new Country("Singapore", 26.45, "Food, Shopping"));
		countryList.add(new Country("France", 10.70, "Skiing, Sight Seeing"));
		countryList.add(new Country("Iceland", 1.75, "Hot Spring, Aurora"));
		countryList.add(new Country("Japan", 11.15, "Food, Mount Fuji"));

		//Refer to the sample flow and write code to match the requirements.
		//Hint: Refer to section F of your worksheet.
		
		int option = 0;
		while (option != 4) {
			menu();
			option = Helper.readInt("Enter a option > ");
			
			if(option == 1)
				countriesByTemp(countryList,1);
			else if(option == 2)
				countriesByTemp(countryList,2);
			else if(option == 3)
				searchString(countryList);
			else if(option == 4)
				System.out.println("GOODBYE");
			else
				System.out.println("Invalid option");
		}
	}
		
	
	
	public static void menu() {
		//Write code to display current date and menu here
		Helper.line(30, "-");
		LocalDate date = LocalDate.of(2018, 3, 27);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
		System.out.println (date.format(formatter));
		System.out.println("Where to go?");
		Helper.line(30, "-");
		System.out.println("1. Warmer countries");
		System.out.println("2. Cooler countries");
		System.out.println("3. Search for recommendations by activity");
		System.out.println("4. Quit");
	}

	
	
	public static void countriesByTemp(ArrayList<Country> countryList, int choice) {
		//Write code here to display warm or cold countries depending on the choice by the user.
String output = "";
		
		Helper.line(40, "-");
		System.out.println("COUNTRIES");
		Helper.line(40, "-");
		
		for (int i = 0; i<countryList.size();i++) {
			if(choice == 1 && countryList.get(i).averageYearlyTempC > 25.0) {
				output += countryList.get(i).name + "\n";
			
			}else if (choice == 2 && countryList.get(i).averageYearlyTempC <= 25.0) {
				output += countryList.get(i).name + "\n";
			}
		}
		System.out.println(output);
	}

	
	
	public static void searchString(ArrayList<Country> countryList) {
		//Write code here to prompt user to enter an activity
		//and display countries that have that activity.
		String search = Helper.readString("Enter a search term > ");
		String output = "Countries related to your search term: \n";
		
		for(int i = 0;i<countryList.size();i++) {
			String thingsToDo = countryList.get(i).thingsToDo;
			search = search;
			
			if(thingsToDo.contains(search)) {
				output += countryList.get(i).name + "\n";
			}
		}
		System.out.println(output);
	}
}
