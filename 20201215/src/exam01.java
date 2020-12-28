import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		// 입력을 받도록 도와주는 변수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("java 접수입력 : ");
		int java = sc.nextInt();
		System.out.print("web 접수입력 : ");
		int web = sc.nextInt();
		System.out.print("android 접수입력 : ");
		int android = sc.nextInt();
		
		int sum = java + web + android;
		float mean = sum/3.0f;
		
		System.out.println(String.format("총합 : %d \n평균 : %f", sum, mean));
	}
}
