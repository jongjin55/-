import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
		int i = 3;
		int j = 10;
		
		System.out.println(i==j ? "����" : "�ٸ���");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int k = sc.nextInt();
		
		String a = k%2==0 ? "¦��" : "Ȧ��";
		System.out.println(k + "��(��) " + a + "�Դϴ�");
		System.out.println(String.format("%d��(��) %s�Դϴ�", k, a));
		System.out.println(String.format("%d��(��) %s�Դϴ�", k, k%2 == 0 ? "¦��" : "Ȧ��"));
	}
}
