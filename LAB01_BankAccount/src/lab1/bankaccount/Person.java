package lab1.bankaccount;

public class Person {
	String name ;
	String surname ;
	String sex ;
	String occupation ;
	String organization ;

	Person(String n,String s,String se,String oc,String or ){
		name = n;
		surname = s;
		sex = se;
		occupation = oc;
		organization = or;
		
	}
	void printInfo() {
		System.out.println("Name : "+name);
		System.out.println("Surname : "+surname);
		System.out.println("Sex : "+sex);
		System.out.println("Occupation : "+occupation);
		System.out.println("Organization : "+organization);
	}
	
	

}
