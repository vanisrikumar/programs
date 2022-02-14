package week1.day2;

public class Calculator {
	public void addTwoNumber() {
		int a=90;
		int b=28;
		int c=a+b;
		System.out.println("addition of a and b is "+c);
	}
	public void subTwoNumber() {
		int a=78;
		int b=67;
		int d=a-b;
		System.out.println("subtraction of a and b is "+d);
	}
	public void mulTwoNumber() {
		int a=7;
		int b=4;
		int x=a*b;
		System.out.println("multiplication of a and b is "+x);
	}
	public void divTwoNumber() {
		int a=60;
		int b=2;
		int y=a/b;
		System.out.println("division of a and b is "+y);
	}

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addTwoNumber();
		calc.subTwoNumber();
		calc.mulTwoNumber();
		calc.divTwoNumber();
		
	}

}
