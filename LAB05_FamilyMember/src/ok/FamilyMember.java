package ok;

public class FamilyMember {
	 static String familyName="Hilton";
	 String firstName;
	 static double commonFund=100000.00;
	 double privateFund;
	 
	 FamilyMember(String firstName , double privatefund){
		 this.firstName=firstName;
		 this.privateFund=privatefund;
	 }
	 void printPrivateFund() {
		 System.out.println(firstName +familyName+ "has $"+privateFund);
	 }
	 void contributeToCommonFund(double amount) {
		 privateFund=privateFund-amount;
		 commonFund=commonFund+amount;
	 }
	 static void payFromCommonFund(double amount) {
		 commonFund=commonFund-amount;
	 }
}
