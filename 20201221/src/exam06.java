import java.util.Arrays;
import java.util.Scanner;

public class exam06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(String.format("%d��° �Է� >> ", i + 1));
			array[i] = sc.nextInt();

		}
		System.out.println(String.format("�Էµ� ���� : %s", Arrays.toString(array)));

		int max, min;
		max = min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(String.format("�ְ� ���� : %d", max));
		System.out.println(String.format("���� ���� : %d", min));
		
		
	}
}
