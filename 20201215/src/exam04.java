import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�󱸰��� ����  : " );
		
		int i = sc.nextInt();
		
		int a = i/5;
		int b = i%5 == 0 ?  a : a+1;
		
		System.out.println("������ ���� : " + b);
}
}
