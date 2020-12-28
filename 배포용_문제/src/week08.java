import java.util.Scanner;

public class week08 {
	public static void main(String[] args) {
//		팩토리얼 
		int total = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int i = sc.nextInt();
		
		while (i>1) {
			total *= i;
			i--;
				
		}
		
		System.out.println(String.format("출력 : %d", total));
		
}
}
