import java.util.Scanner;

public class week09_Strong {
	public static void main(String[] args) {

		// ���μ� ����
		Scanner sc = new Scanner(System.in);

		System.out.print("���μ����� �� ���� �Է��ϼ��� : ");
		int i = sc.nextInt();

		System.out.print(String.format("%d = ", i));

		for (int j = 2; j <= i; j++) {

			while (i % j == 0) {
				i /= j;

				if (i == 1) {
					System.out.print(j);
				} else
					System.out.print(j + "*");
			}
		}
	}
}
