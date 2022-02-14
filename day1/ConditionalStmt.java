package week1.day1;

public class ConditionalStmt {

	public static void main(String[] args) {
		int a=-42;
		if(a>0) {
			System.out.println(a+" is positive number");
		}
		else if(a<0) {
			System.out.println(a+" is negative number");
			int b=a*-1;
			System.out.println(b+" is converted to a positive number");
		}
		else {
			System.out.println(a+" is neither positive nor negative number");
		}

	}

}
