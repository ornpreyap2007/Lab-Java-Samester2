package people;

public class TestPeopleID {
	public static void main(String [] args){
		/*use the keyword new to construct a Date object with day=23 month=4 and
		year=2000, assign this Date object to a variable dobObj of type Date */
		Date dobObj=new Date(23,4,2000);
		
		/*use the keyword new to construct a Name object with firstName =
		"Somchai" and lastName = "Yodying", assign this Name object to a
		variable nameObj of type Name*/
		Name nameObj=new Name("Somchai","Yodying");

		/*use the keyword new to construct an Address object with the following
		information houseNo="81/9", Soi= “2”, road = "ChiangMai-HangDong",
		subDistrict="Sunpakwan", district= "Hang Dong", province= "Chiang Mai",
		and postcode= "50230", assign this Address object to a variable
		addressObj of type Address */
		Address addressObj=new Address("81/9","2","ChiangMai-HangDong","Sunpakwan","Hang Dong","Chiang Mai","50230");
		
		/* assign "3-5015-00274-987" to a variable idObj of type String */
		String idObj="3-5015-00274-987";
		
		/*use the keyword new to construct a PeopleID from the dobObj, nameObj,
		idObj and addressObj you just constructed, assign this peopleID object
		to a variable peopleIDObj of type PeopleID */
		PeopleID peopleIDObj=new PeopleID(nameObj,idObj,dobObj,addressObj);
		
		/*Call the method printPeopleID() of peopleIDObj */
		peopleIDObj.printPeopleID();
		
		System.out.println("--------------------------------------------");
		System.out.print("The name of peopleIDObj is ");
		/*printout the name of peopleIDObj by calling the method printName() of
		the name property of peopleIDObj */
		peopleIDObj.name.printName();
		
		System.out.print("The postcode of the peopleIDObj is ");
		/*use System.println to print the postcode of the address property of
		peopleIDObj */
		System.out.println(addressObj.postcode);
		
		System.out.println("--------------------------------------------");
		}
}
