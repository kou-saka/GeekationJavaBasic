package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//aがbより大きい場合
		int a = 1;
		int b = 2;
		
		boolean result = (a > b);
		
		System.out.println(result);
		
		//天気が晴れかつ暖かい場合
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean andResultA = (isSunny && isWarm);
		
		System.out.println(andResultA);
		
		//xが0以上かつyが偶数の場合
		int x = 3;
		int y = 4;
		
		boolean andResultB = (x >= 0 && y % 2 == 0);
		
		System.out.println(andResultB);
		
		//hasPermissionがfalseの場合にtrue
		boolean hasPermission = false;
		
		System.out.println(!hasPermission);
	}

}
