import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
	// Scanner�� ��������� ������Ÿ�� -> Ư�� ������ �о� ���� �� ���
		Scanner sc = new Scanner(System.in);
		
//		int input = sc.nextInt();
//		System.out.println(input);
//		
//		int input2 = sc.nextInt();
//		System.out.println(input2);
		
		System.out.print("�� �Է� : ");
		int totalSecond = sc.nextInt();
		
	
	
		int num3 = totalSecond / 3600;
		int num2 = (totalSecond / 60) % 60;  //  % (60*60) / 60
		int num1 = totalSecond % 60;
		
		System.out.println(num3 + "�� " +num2 + "�� " + num1 + "��");
		System.out.println(String.format("%d��  %d�� %d �� ", num3, num2, num1));
		
		
		
	}
}
