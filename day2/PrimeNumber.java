package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=10;
		int count=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				count++;
				
				
			}
		}
				
if(count==0) {
	System.out.println("It is prime number");
}
else {
	System.out.println("It is not a prime number");
}
	}

}
