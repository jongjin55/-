import java.util.Random;

public class exam05 {
	public static void main(String[] args) {

		// ������ ���� �ʱ�ȭ�� 1���� �迭�� ������.
		// ���߿� ���� ū ���� ���� ���� ���� �˰����� ������

		int[] array = { 100, 8, 743, 32, 10, 4, 46, 9, 11, 33, 95 };

		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(String.format("�ִ밪 %d, �ּҰ� %d", max, min));
	}
}
