package CompanyHierarchy;

public class Employee extends Person{
	String workplace;
	String position;
	double salary;
	
	Employee(String firstName,String lastName,
			int day,int month,int year,String workplace,
			String position,double salary){
		super(firstName,lastName,day,month,year);
		this.workplace=workplace;
		this.position=position;
		this.salary=salary;
	}
	void printInfo() {
		 super.printInfo();
		 System.out.println("Work Place:" +workplace);
		 System.out.println("Position: "+position);
		 System.out.println("Salary: "+salary);

	}
	void followRule(String rule) {
		System.out.println("Position: "+name.firstName+" "+name.lastName);
		System.out.println("Announces rule: "+rule);
	}
}
