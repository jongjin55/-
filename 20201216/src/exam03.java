import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
	// ������ ê���� ������
		Scanner sc= new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		
		String userMsg = sc.next(); // ���ڿ��� �Է¹޴� ���
		
		// �ȳ��ϼ���, �ݰ�����, �����ϼ���, other �߸��Է��Ͽ����ϴ�
		switch (userMsg) {
		case "�ȳ��ϼ���" :
			System.out.println("��, �ȳ��ϼ���");
			break;
		case "�ݰ�����" :
			System.out.println("��, �ݰ�����~");
			break;
		case "�����ϼ���" :
			System.out.println("��, �����ϼ���!!");
			break;
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			break;
		}
		
}
}
