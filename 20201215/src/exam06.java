import java.util.Scanner;

public class exam06 {
	public static void main(String[] args) {
	// number ������ ������� �������� 0���� �����ϴ� ���α׷�
		int number = 10;
		
		if(number>0)
			System.out.println("���");
		else if(number <0)
			System.out.println("����");
		else
			System.out.println("0");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("============ ����� ���α׷� =============");
		System.out.print("���̸� �������ּ��� : ");
		int i = sc.nextInt();
		
		System.out.print("�ο����� �������ּ��� : ");
		int j = sc.nextInt();
	
		int result = 5000;
		
		
		if(i < 20)
			System.out.println(String.format("�� %d���Դϴ�", (result/2)*j));
		else
			System.out.println(String.format("�� %d���Դϴ�",  (result * j)));
			
}
}
