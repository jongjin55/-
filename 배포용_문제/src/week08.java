import java.util.Scanner;

public class week08 {
	public static void main(String[] args) {
//		���丮�� 
		int total = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		int i = sc.nextInt();
		
		while (i>1) {
			total *= i;
			i--;
				
		}
		
		System.out.println(String.format("��� : %d", total));
		
}
}
