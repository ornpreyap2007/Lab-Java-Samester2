package lab1.bankaccount;

public class BankAccount {
	Person person;
	String accountNumber;
	double balance;
	
	BankAccount(String name , String surname, String sex, String occupation,String organization , String acc,double b){
		person = new Person(name,surname,sex,occupation,organization);
		accountNumber = acc;
		balance = b;
		
	}
	void deposit(double x) {
		balance+=x ;
	}
	void withdraw(double x) {
		balance-=x;
	}
	void printInfo() {
		person.printInfo();
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Balance : "+balance);
	}
	void printBalance() {
		System.out.println("Balance : "+balance+"million USD");
	}
	double convertBalanceToTHB() {
		return balance*31;
	}
}
