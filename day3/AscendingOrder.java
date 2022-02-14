package week1.day3;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] value= {4,9,1,7,3};
		Arrays.sort(value);
		for(int i=value.length-1;i>=0;i--) {
			System.out.println(value[i]);
		}
		

	}

}
