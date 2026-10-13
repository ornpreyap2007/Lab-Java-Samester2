package Outside;
import Developer.BankAccount;
public class TestAccount2 {
	public class TestBankAccount2 {
		public static void main(String [] args){
		BankAccount acc = new BankAccount("Paris Hilton","127-983-3847",1000000.00 );
		System.out.println(acc.accountNumber);//accountNumber is default can not access form out side package
		}
}
}
