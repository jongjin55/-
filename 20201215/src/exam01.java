import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		// �Է��� �޵��� �����ִ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("java �����Է� : ");
		int java = sc.nextInt();
		System.out.print("web �����Է� : ");
		int web = sc.nextInt();
		System.out.print("android �����Է� : ");
		int android = sc.nextInt();
		
		int sum = java + web + android;
		float mean = sum/3.0f;
		
		System.out.println(String.format("���� : %d \n��� : %f", sum, mean));
	}
}
