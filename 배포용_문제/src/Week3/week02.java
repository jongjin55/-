package Week3;

public class week02 {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '+';

		System.out.println(cal(num1, num2, op));
	}

	private static String cal(int num1, int num2, char op) {
		// TODO Auto-generated method stu
		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}

		return result + "";
		// 숫자 + 문자 를 하면 문자로 형변환이 일어남

	}
}
