package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a= {76,32,11,99,22};
		int[] b= {99,22,89,64,28,11};
		System.out.println("Intersection of two arrays: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(b[j]);
				}
				
			}
			
		}
	}

}
