package Developer;

public class TestAccount1 {
	public static void main(String [] args){
		BankAccount acc = new BankAccount("Paris Hilton","127-983-3847",1000000.00);
		System.out.println(acc.balance);
		//propertie balance is private can not access anywhere outside class Bankaccount
		}
}

