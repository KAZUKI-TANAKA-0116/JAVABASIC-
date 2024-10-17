package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {

		int a = 50;
		int b = 10;

		int result1 = add(a, b);
		allResult(result1);

		int result2 = subtract(a, b);
		allResult(result2);

		int result3 = multiply(a, b);
		allResult(result3);

		int result4 = divide(a, b);
		allResult(result4);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return a % b;
	}

	public static void allResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
}