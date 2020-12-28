import java.util.Random;

public class exam05 {
	public static void main(String[] args) {

		// 임의의 수로 초기화뇐 1차원 배열을 만들자.
		// 그중에 가장 큰 수와 작은 수를 차즌 알고리즘을 만들자

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
		System.out.println(String.format("최대값 %d, 최소값 %d", max, min));
	}
}
