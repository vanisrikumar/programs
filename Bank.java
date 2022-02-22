package week3.assignments;

public class Bank extends SBI implements CIBIL,PNB {

	public void maximumLoanAmount() {
		System.out.println(" maximumLoanAmount:");
		
	}

	public void creditScore() {
		System.out.println("creditScore:");
		
	}

	public void minimumBalance() {
		System.out.println("minimumBalance:");
		
	}

	public void cibilScore() {
		System.out.println("cibilScor:");
		
	}

	public void bankBalance() {
		System.out.println("bankBalance:");
		
	}
	public static void main(String[] args) {
		Bank a=new Bank();
		a.bankBalance();
		a.cibilScore();
		a.creditScore();
		a.ItLoan();
		a.maximumLoanAmount();
		a.maximumLoanAmount();
		a.minimumBalance();

}}