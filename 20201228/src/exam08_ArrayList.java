import java.util.ArrayList;
import java.util.Scanner;

public class exam08_ArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();

		while (true) {
			System.out.print("[1] �뷡�߰�  [2] �뷡 ����  [3] ���� >> ");
			int menu = sc.nextInt();

//			System.out.println("========== ���� ��� ��� ==========");
//			if (arr.size() == 0)
//				System.out.println("��� ����� �����ϴ�.");
//			else {
//				for (int i = 0; i < arr.size(); i++) {
//					System.out.println((i + 1) + ". " + arr.get(i));
//				}
//			}
//			System.out.println("==============================");

			if (menu == 1) {
				System.out.println("========== ���� ��� ��� ==========");
				if (arr.size() == 0)
					System.out.println("��� ����� �����ϴ�.");
				else {
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i + 1) + ". " + arr.get(i));
					}
				}
				System.out.println("==============================");
				System.out.print("[1] ��������ġ�� �߰� [2] ���ϴ� ��ġ�� �߰� >> ");
				menu = sc.nextInt();

					if (menu == 1) {
						System.out.print("�߰��� �뷡 �Է� : ");
						String title = sc.next();
						arr.add(title);
						System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
					} else {
						System.out.print("�߰��� �뷡 �Է� : ");
						String title = sc.next();
						System.out.print("�߰��� ��ġ �Է� >> ");
						int j = sc.nextInt();
						arr.add(j - 1, title);
	
						System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
					}

				System.out.println();
			} else if (menu == 2) {

				System.out.println("========== ���� ��� ��� ==========");
				if (arr.size() == 0)
					System.out.println("��� ����� �����ϴ�.");
				else {
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i + 1) + ". " + arr.get(i));
					}
				}
				System.out.println("==============================");
				
					if (arr.size() != 0) {
						System.out.print("[1] ���û��� [2] ��ü���� >> ");
						menu = sc.nextInt();
						if (menu == 1) {
							System.out.print("������ �뷡 ���� >> ");
							int i = sc.nextInt();
							arr.remove(i - 1);
							System.out.println("�뷡�� �����Ǿ����ϴ�.");
						} else {
							arr.clear();
							System.out.println("�뷡�� ��ü�����Ǿ����ϴ�.");
						}
					}
			}

			if (menu == 3)
				break;
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
