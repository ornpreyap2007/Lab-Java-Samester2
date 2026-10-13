package CompanyHierarchy;

public class Name {
	String firstName;
	String lastName;
	
	Name(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	void printName() {
		System.out.println("Name: "+firstName+" "+lastName);
	}
}
