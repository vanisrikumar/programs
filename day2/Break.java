package week1.day2;

public class Break {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i==10) {
				System.out.println("ten");
				continue;
			}
			else if(i==11) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
