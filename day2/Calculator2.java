package week1.day2;

public class Calculator2 {
	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumber(int a,int b) {
		int x=a-b;
		System.out.println(x);
	}
	

	public static void main(String[] args) {
		Calculator2 calc=new Calculator2();
		calc.addTwoNumber(34, 67);
		calc.addTwoNumber(78, 97);
		calc.subTwoNumber(8, 2);
	}

}
	