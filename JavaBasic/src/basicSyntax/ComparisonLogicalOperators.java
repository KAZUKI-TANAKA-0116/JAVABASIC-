package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 10;
		boolean isGreaterA = (a > b);

		System.out.println(isGreaterA);//true
	
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean andResultA = (isSunny && isWarm) ;
		System.out.println(andResultA);//true
		
		int x = 5;
		int y = 10;

		boolean andResultB = (x > 0 && y % 2 == 0);

		System.out.println(andResultB); // true
		
		boolean haspermission;
		haspermission = false;
	    
		boolean notResult = !(haspermission);
	    
		System.out.println(notResult);
	}

}
