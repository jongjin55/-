import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int i = 0;
		
		while (i <= 10) {
			System.out.print("정수 입력 >> ");
			i = sc.nextInt();
		}
		
		System.out.println("프로그램이 종료되었습니다!");
}
}
