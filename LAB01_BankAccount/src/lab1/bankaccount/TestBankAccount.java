package lab1.bankaccount;

public class TestBankAccount {
	public static void main(String[]args) {
		BankAccount wang = new BankAccount("Wang","TaLu","Male","Actor","SIIT","000-000-000",10);
		wang.printInfo();
		
		BankAccount me = new BankAccount("Ornpreya","Punubol","Female","Actor","SIIT","000-000-000",10);
		me.printInfo();
		me.deposit(15);
		me.printBalance();
		me.withdraw(5);
		me.printBalance();
		System.out.println("Balance in THB : "+me.convertBalanceToTHB()+" million bath");
	}

}
