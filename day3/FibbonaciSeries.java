package week1.day3;

public class FibbonaciSeries {

	public static void main(String[] args) {
		int first=0;
		System.out.println(first);
		int second=3;
		System.out.println(second);
		for(int i=2;i<=8;i++) {
			int sum=first+second;
			System.out.println(sum);
			first=second;
			second=sum;
			
		}
	}

}
