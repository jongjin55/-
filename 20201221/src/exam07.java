import java.util.Scanner;

public class exam07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = {"������", "�ּ���", "Ȳ�ص�", "���¾�"};
		
		System.out.print("�˻��ϰ� ���� �̸��� �Է��ϼ��� >> ");
		String find = sc.next();  // �˻��Ϸ��� �̸��� ���ڿ� Ÿ������ �Է�

		//����Ž�� �˰��� : ���������� �������� 0��°���� ����°���� Ž���ϴ� ���
		// ����� ���� Ÿ�Ե��� ��� �ּҰ��� �����ϰ� �ִ�
		// �迭, ���ڿ�  >> equal�� ����ؾ� �Ѵ�.  �ּҰ��� �ƴ϶� �ش繮�ڸ� ���ϰڴ�.
		for (int i = 0; i < names.length; i++) {
			if(find.equals(names[i])) {
				System.out.println(String.format("%s���� %d��°�� �ֽ��ϴ�.", find, i+1));
			}
		}
	}

}
