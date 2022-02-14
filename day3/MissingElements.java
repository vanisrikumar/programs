package week1.day3;

public class MissingElements {

	public static void main(String[] args) {
		int[] num= new int[] {1,5,4,7,3,2};
		int arr[]=new int[num.length];
		int sum=(num.length+1)*(num.length+2)/2;
		
		for(int i=0;i<num.length;i++) {
			arr[i]=num[i];
			sum=sum-arr[i];
			
		}
		System.out.println("missing element is "+sum);
	
	}

}
