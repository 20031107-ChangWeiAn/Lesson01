/**
 * 
 */
package C209_L01;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20031107, 21 Apr 2021 12:30:29 pm
 */

public class Country {
	public String name;
	public double averageYearlyTempC; 
	public String thingsToDo;
	
	public Country(String name, double averageYearlyTempC, String thingsToDo){
		this.name = name; 
		this.averageYearlyTempC = averageYearlyTempC;
		this.thingsToDo = thingsToDo;
	}
	public void display() {
		System.out.println ("name: " + name);
		System.out.println ("averageYearlyTempC: " + averageYearlyTempC);
		System.out.println ("thingsToDo" + thingsToDo);
	}
}
