import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
	// ���Ǳ� ���α׷�
		
		System.out.print("�ݾ��� �Է��ϼ��� >> ");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		System.out.println("�޴��� ������ .");
		System.out.print("1. �ݶ�(800��), 2. ����(500��), 3. ��Ÿ�ο���(1500) >> ");
		
		int j = sc.nextInt();

		int k = 0;
		
		switch (j) {
		case 1:
			k = 800;	
			break;
		case 2:
			k = 500;
			break;
		case 3:
			k = 1500;
//			i-= 1500
			break;
		default:
			System.out.println("�ٽ� ������ �ּ���!!");
			break;
		}
		
		int o = i-k;
		
		if(i<k) {
			System.out.println("���� �����մϴ٤Ф�");
			System.out.println(String.format("�� �� >> %d", i));
		} else {
			System.out.println(String.format("�� �� >> %d", o));
			System.out.println(String.format("õ �� : %d��", o/1000 ));
			System.out.println(String.format("����� : %d��", o%1000/500));
			System.out.println(String.format("�� ��: %d��", o%1000 %500/100));
		}
		}
}
