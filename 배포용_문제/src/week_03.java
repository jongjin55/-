import java.util.Scanner;

public class week_03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵ �Է� >> ");
		int i = sc.nextInt();
		
		
		if(i % 4 == 0 && i%100 != 0 || i%400 == 0) {
			System.out.println("����");
		} else
			System.out.println("���� �ƴ�");
}
}
