
public class exam03 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 24;
		
		int result = largeNumbers(num1, num2);
	
		System.out.println("´õ Å« ¼ö : " + result);
	}

	private static int largeNumbers(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}
		return num2;
		// TODO Auto-generated method stub
	}
}
