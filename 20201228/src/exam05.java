import java.util.Arrays;

public class exam05 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 3;

		boolean result = isDivide(num1, num2);

		System.out.println("��� ���� : " + result);

		num2 = 2;
		System.out.println("��� ���� : " + isDivide(num1, num2));
		// 5�� 15�� ������� �˰� �;�
		System.out.println("��� ���� : " + isDivide(15, 5));

		// number�� ������ number�� ������� �˷��ִ� �޼ҵ�
		// 10 -> 1,2,5,10
		// 15 -> 1, 3, 5, 15

		int number = 10; // ������� �˰� ���� ����
		int[] array = getDivisors(number);

		System.out.println(Arrays.toString(array)); // �迭�� ������ ���ڿ��� �ٲ㼭 ���

		// ������ ���ϱ�
		boolean perfectNumResult = isPerfectNum(6);
		System.out.println(perfectNumResult);
	}

	private static boolean isPerfectNum(int i) {
		// TODO Auto-generated method stub
		
		// ������� ���ϴ� �ڵ�
		int[] result = getDivisors(i);
		
		// ���������� �ƴ��� �Ǻ��ϴ� �ڵ�
		int sum = 0;
		for (int j = 0; j < result.length; j++) {
			sum += result[j];
		}

		return sum == i * 2 ? true : false;
	}

	private static int[] getDivisors(int number) {
		int[] result = new int[number];

		int saveIndex = 0; // ����Ǵ� ���� �ε���
		// TODO Auto-generated method stub
		for (int i = 1; i <= number; i++) {
			if (isDivide(number, i)) {
				result[saveIndex++] = i; // ����� ����迭�� ����
			}

		}

		return result;
		// null -> �ּҰ��� ����Ű�� ���� ���� �� ���
	}

	private static boolean isDivide(int num1, int num2) {
		// TODO Auto-generated method stub

		if (num1 % num2 == 0)
			return true; // return�� �޼ҵ� ���� ���ҵ� �Ѵ�. �ڿ� �ҽ��ڵ�� �������� �ʴ´�.
		else // ��� x
			return false;
	}
}
