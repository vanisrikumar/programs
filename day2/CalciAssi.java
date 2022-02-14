package week1.day2;

public class CalciAssi {
	public void mulTwoNumber(double a, double b) {
		double c=a*b;
		System.out.println("Mul of two numbers: "+c);
	}
	public void divTwoNumber(float e,float f) {
		float x=e/f;
		System.out.println("div of two numbers: "+x);
	}
	public static void main(String[] args) {
		CalciAssi cal=new CalciAssi();
		cal.mulTwoNumber(23, 34);
		cal.divTwoNumber(21, 5);
		
	}

}
