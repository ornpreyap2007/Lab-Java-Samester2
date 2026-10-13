package a;

public class PartTime extends Employee implements TaxPayer{
	String workplace;
	double numHrPerWeek;
	double hourlyRate;
	
	PartTime(String name,String position,String workplace,
			double numHrPerWeek,double hourlyRate){
		super(name,position);
		this.workplace=workplace;
		this.numHrPerWeek=numHrPerWeek;
		this.hourlyRate=hourlyRate;
	}
	void printWorkPlace( ) {
		System.out.println("Work at "+workplace);
	}
	double calculateMonthlyIncome( ) {
		return hourlyRate*numHrPerWeek*4;
	}
	public double calculateYearlyIncome( ) {
		return calculateMonthlyIncome()*12;
	}
	public double calculateTax( ) {
		return calculateYearlyIncome()*calculateTaxRate(calculateYearlyIncome());
	}
	public void payTax() {
		System.out.println("Pay tax "+calculateTax());
	}
	void printInfo( ) {
		super.printInfo();
		printWorkPlace();
		System.out.println("Yearly income is "+calculateYearlyIncome());
		payTax();
	}
}
