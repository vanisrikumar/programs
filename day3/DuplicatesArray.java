package week1.day3;

public class DuplicatesArray {

	public static void main(String[] args) {
		int[] num= new int[] {2,7,9,2,6,7,3,1,9};
		System.out.println("duplicate elements in the given array: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println(num[j]);
				}
			}
			
		}
	}

}
