package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num;
		
		for (num =1; num <= 100; num++) {
			
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (num % 3 == 0) {
				System.out.println("Fuzz");
			}
			else if (num % 5 == 0) {
				System.out.println("Buzz");
			}
			else{
				System.out.println(num);
			}
		}
		
		
		String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		
		for (String language: languages) {
			
			if (language == "Java") {
				System.out.println("現在学習中の言語は" + language + "です。");
				continue;
			}
			else if (language == "HTML") {
				System.out.println("現在学習中の言語は" + language + "です。");
				break;
			}
			else {
				System.out.println(language);
			}
		}
	}
}
