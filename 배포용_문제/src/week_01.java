import java.util.Scanner;



public class week_01 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반올림 전 값 : ");
		int i = sc.nextInt();
		
		int result = i % 10;
		int result2 = i - result;
		
		if(result > 4) {
			result2 = result2 + 10;
		}
			
		
		System.out.println(String.format("반올림 후 값 : %d", result2));
 }
}
