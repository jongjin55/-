import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
	//���� �Է��ϸ� ������ �˷��ִ� ���α׷��� ������
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("�� �Է� >> ");
		
		String userMsg = sc.next();
	
		String a = "";
		
		switch (userMsg) {
			case  "1" :
			case  "2" :
			case  "12" :
				a = "�ܿ�";
				break;
			case  "3" :
			case  "4" :
			case  "5" :
				a = "��";
				break;
			case  "6" :
			case  "7" :
			case  "8" :
				a = "����";
				break;
			case  "9" :
			case  "10" :
			case  "11" :
				a = "����";
				break;
			default:
				break;
		}
		System.out.println(String.format("%s����  %s�Դϴ�.!", userMsg, a));
}
}
