package Week2;

public class week14 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		
		boolean result = isDivide(num1, num2);
		System.out.println("��� Ȯ�� : " + result);
	}

	private static boolean isDivide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num1 % num2 == 0)
			return true;
		
		return false;
	}
}
