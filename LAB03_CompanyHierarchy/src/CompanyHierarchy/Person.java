package CompanyHierarchy;

public class Person {
	Name name;
	Date dateOfBrith;
	static int numPerson=0;
	
	Person(String firstName,String
			lastName,int day,int month,int year){
		name = new Name(firstName,lastName);
		dateOfBrith = new Date(day,month,year);
		numPerson++;
	}
	void printInfo() {
		name.printName();
		dateOfBrith.printDate();
		printAgeAtYear(dateOfBrith.year);;
	}
	void printAgeAtYear(int year) {
		System.out.println("Age:"+(2026-year));
	}
	static void printNumberOfPerson() {
		System.out.println("The total number of Persons is "+numPerson);
	}
}
