import java.util.Scanner;

public class week_02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ݾ� : ");
		int i = sc.nextInt();
		
		System.out.println("�ܵ���ȯ");

		int mc = i%10000;
		
		int m = i/10000;
		int o = (i%10000) /5000;
		int c = ((i%10000) %5000) /1000;
		int ob = (((i%10000) %5000) %1000) /500;
		int b = ((((i%10000) %5000) %1000) %500) /100;
		
		System.out.println("10000�� : " + m);
		System.out.println("5000�� : " + o);
		System.out.println("1000�� : " + c);
		System.out.println("500�� : " + ob);
		System.out.println("100�� : " + b);
}
}
