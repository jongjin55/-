

public class exam05_Strong {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1234;
		int div = 1000;
		
		while (div >= 1) {
			
			sum += (num/div);
			num%=div;
			div/=10;
		}
		
		System.out.println(sum);
	}
}