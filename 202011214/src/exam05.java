import java.util.Scanner;

public class exam05 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Java ���� �Է� : ");
		int num3 = sc.nextInt();
		
		System.out.print("Web ���� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("Android ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.println("�հ� : " + (num1+num2+num3));
		System.out.println("��� : " + (num1+num2+num3) / 3);
}
}
