import java.util.Arrays;
import java.util.Scanner;

public class exam07_���� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] id = new String[3];
		String[] pw = new String[3];

		int cnt = 0;

		while (true) {

			System.out.println("1.ȸ������  2. �α��� 3. ����");
			int q = sc.nextInt();

			switch (q) {

			case 1:

				if(cnt < 3) {
				System.out.print("id : ");
				id[cnt] = sc.next();
				System.out.print("pw : ");
				pw[cnt] = sc.next();
				cnt++;
				System.out.println("���Լ���");
				}else {
					System.out.println("���ԺҰ�");
					break;
				}
				break;

			case 2:
				System.out.print("id : ");
				String j = sc.next();
				if (id[0].equals(j) || id[1].equals(j) || id[2].equals(j)) {
					System.out.print("pw : ");
					String p = sc.next();
					if (pw[0].equals(p) || pw[1].equals(p) || pw[2].equals(p)) {
						System.out.println("�α��� ����");
					} else {
						System.out.println("�α��� ����");
					}
				} else
					System.out.println("�������� �ʴ� ���̵��Դϴ�.");

				break;
			case 3:
				System.out.println("���α׷� ����");
				break;

			}
			if (q == 3)
				break;
		}

		System.out.println(Arrays.toString(id));
		System.out.println(Arrays.toString(pw));
	}
}
