package Outside;
import Developer.BankAccount;
public class BankAccount2_Testing {
	public static void main(String[] args) {
		BankAccount account2 = new BankAccount("Paris Hilton", "127-983-3847",1000000.00);

		account2.printInfo(); //medthod printInfo has default Visibility which cannot access from different package
		
		account2.withdraw(300.00);//medthod widdraw has protected Visibility which cannot access form different package /class that is not sublclass to the class that has this medthod
		System.out.println("The balance of account1 is $" +account2.getbalcance());
		}
}
