import java.util.Arrays;

public class exam03_Bubble {
	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1 };

		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));

//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				temp = arr[i + 1];
//				arr[i + 1] = arr[i];
//				arr[i] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				temp = arr[i + 1];
//				arr[i + 1] = arr[i];
//				arr[i] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				temp = arr[i + 1];
//				arr[i + 1] = arr[i];
//				arr[i] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
	}
}
