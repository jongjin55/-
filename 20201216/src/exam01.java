import java.util.Scanner;


public class exam01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int db = sc.nextInt();
		
		System.out.print("���ڰ��� ���� : ");
		int ca = sc.nextInt();
		
		System.out.print("OS : ");
		int os = sc.nextInt();
		
		System.out.print("��������� : ");
		int dt = sc.nextInt();
		
		System.out.print("����Ʈ������� : ");
		int st = sc.nextInt();
		
		int total = db + ca + os + dt + st;
		
		// Ż�� ����
		if(db < 8|| ca < 8 || os < 8 || dt < 8 || st < 8 || total < 60) {
			System.out.println("���հ��Դϴ�.!");
		} else
			System.out.println("�հ��Դϴ�.!");
		
		
		// �հ� ����
		if(total >=60) {
			if(db >=8 && ca >= 8 && os >=8 && dt >=8 && st>=8) {
				System.out.println("�հ��Դϴ�.!");
			} else {
				System.out.println("���հ��Դϴ�.!");
			}
		} else {
				System.out.println("���հ��Դϴ�.!");	
			}
		
		
		// �հ� ���
		
		if(total >=60 && db >=8 && ca >= 8 && os >=8 && dt >=8 && st>=8) {
			System.out.println("�հ��Դϴ�");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
}
