import java.util.Scanner;



public class week_01 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݿø� �� �� : ");
		int i = sc.nextInt();
		
		int result = i % 10;
		int result2 = i - result;
		
		if(result > 4) {
			result2 = result2 + 10;
		}
			
		
		System.out.println(String.format("�ݿø� �� �� : %d", result2));
 }
}
