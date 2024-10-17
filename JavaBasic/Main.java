package basicSyntax;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ		
		int age = 18;
		double height = 169.5;

		GeekIntroduction.greeting(age, height);

		System.out.println("こんにちは！私はGeek君でごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");

		int num1 = 5;
		int num2 = 100;

		GeekIntroduction.specialSkill(num1, num2);

		for (num1 = 5; num1 <= num2; num1++) {

			if (num1 < 1 || num2 < 0) {
				System.out.println("num1とnum2は0より大きい値にしてください。");
				break;
			} else if (num2 <= num1) {
				System.out.println("num2はnum1より大きい値にしてください。");
				break;
			} else if (300 < num1 || 300 < num2) {
				System.out.println("num1とnum2は300以下にしてください。");
				break;
			} else if (num1 % 3 == 0 && num1 % 5 == 0) {
				System.out.println(num1 + "は3倍数かつ5の倍数です。");
				continue;
			} else if (num1 % 3 == 0) {
				System.out.println(num1 + "は3倍数です。");
				continue;
			} else if (num1 % 5 == 0) {
				System.out.println(num1 + "は5の倍数です。");
				continue;
			} else {
				System.out.println(num1);

			}
		}
	}

}
