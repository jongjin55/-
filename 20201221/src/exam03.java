import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
		// ������ �迭 ����
		// ũ��� 10ĭ
		// ��ĭ���� 1~20 ������ ���ڷ� �ʱ�ȭ
		Random rd = new Random();
		
		int j = 0;
		int[] arrayint;
		arrayint = new int[10];

		int[] array2 = { 1, 19, 15, 3, 6, 17, 20, 9, 4, 11 };

		for (int i = 0; i < arrayint.length; i++) {
			arrayint[i] = rd.nextInt(20)+1;
		}
		System.out.println(arrayint[1]);// �ε������� �ۼ��ؾ� �ش� ĭ�� �ִ� ���� Ȯ�ΰ����ϴ�
		System.out.println(arrayint);//���۷��� ������ ����ϸ� �ּҰ� ���´�.
		System.out.println(Arrays.toString(arrayint));  // �迭�� ���ڿ��� ��ȯ

	}
}
