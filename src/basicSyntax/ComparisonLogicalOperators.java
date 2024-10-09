package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 15;
	    int b = 10;
	    boolean isGreaterA = (a > b);

	    System.out.println(isGreaterA);//true
	    
	    boolean isSunny = true;  // 晴れているかどうか
	    boolean isWarm = true;   // 暖かいかどうか

	    // 天気が晴れかつ暖かい場合にtrue、それ以外の場合はfalseを出力
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
