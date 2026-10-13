package Developer;

public class BankAccount1_Testing {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Paris Hilton", "127-983-3847",1000000.00);

		System.out.println("The balance of account1 is $" +account1.balance);
		//propertie balance is private can not access anywhere outside class Bankaccount
		
		// deposit $300 for account1
		account1.deposit(300);
		// print out the The balance of account1
		System.out.println("The balance of account1 is "+account1.getbalcance());
		//we cannot access properties balance directly bcs balance has private Visibility we have to use medthod to access balance instand
		}
}
