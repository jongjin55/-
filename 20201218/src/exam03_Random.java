import java.util.Random;
import java.util.Scanner;

public class exam03_Random {
	public static void main(String[] args) {
		// ���� ����
		Random random = new Random(); // ������ ����� ��������� ������ Ÿ�� ���������
		Scanner sc = new Scanner(System.in);
		// ()�ȿ� ���ڸ� �־��ָ� ������ ���� �� ��) (20)�̸� 0~19���� ���� ���� // (20)+1 1~20
		// ���� 100~200 ���̶�� (101)+100
		int num1;
		int num2;
		int j;

		System.out.println("==Plus Game==");

		for (int i = 0; i < 5; i++) {

			num1 = random.nextInt(20) + 1;
			num2 = random.nextInt(20) + 1;

			for (int k = 0; k < 3; k++) {
				System.out.print(String.format("%d + %d = ", num1, num2));
				j = sc.nextInt();

				if (num1 + num2 == j) {
					System.out.println("Success");
					break;
				} else {
					System.out.println("Fail");
				}
			}
		}
	}

}
