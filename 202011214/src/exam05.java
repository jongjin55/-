import java.util.Scanner;

public class exam05 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Java 점수 입력 : ");
		int num3 = sc.nextInt();
		
		System.out.print("Web 점수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Android 점수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("합계 : " + (num1+num2+num3));
		System.out.println("평균 : " + (num1+num2+num3) / 3);
}
}
