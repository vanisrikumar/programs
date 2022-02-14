package week1.day4;

public class StringName {
	public int  z;
	public int add() {
		int a=7;
		int b=2;
		 z=a+b;
		 System.out.println(z);
		return z;
	}
	public void getMobileBrand() {
		//return "redmi";
		int x=5;
		System.out.println(x+z);
	}
    public boolean getCharged() {
    	String str = "vanisri";
    	if(str.equals("vanisri")) {
    		System.out.println(true);
    		return true;
    	}
    	else{
    		return false;
    	}
    	//return null;
    }

	public static void main(String[] args) {
		StringName str=new StringName();
		str.add();
		str.getCharged();
		str.getMobileBrand();
		
	}

}
