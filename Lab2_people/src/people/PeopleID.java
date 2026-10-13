package people;

public class PeopleID {
	Name name;
	String ID;
	Date dateOfBirth;
	Address address;
	
	PeopleID(Name name,String ID){
		this.name=name;
		this.ID=ID;
	}
	PeopleID(Name name, String ID, Date dateOfBirth,Address address){
		this(name, ID);
		this.dateOfBirth=dateOfBirth;
		this.address=address;
	}
	void printPeopleID() {
		name.printName();
		dateOfBirth.printDate();
		address.printFullAddress();
		
	}
}
