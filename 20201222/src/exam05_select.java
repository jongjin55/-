import java.util.Arrays;

public class exam05_select {
	public static void main(String[] args) {

		int[] arr = { 7, 4, 1, 8, 2 };

		System.out.println(Arrays.toString(arr));
		int min = arr[0];
		int minIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;

		System.out.println(Arrays.toString(arr));
		
		min = arr[1];
		minIndex = 0;
		for (int i = 2; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		temp = arr[1];
		arr[1] = arr[minIndex];
		arr[minIndex] = temp;

		System.out.println(Arrays.toString(arr));
		
		min = arr[2];
		minIndex = 0;
		for (int i = 3; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		temp = arr[2];
		arr[2] = arr[minIndex];
		arr[minIndex] = temp;

		System.out.println(Arrays.toString(arr));
	}
}
