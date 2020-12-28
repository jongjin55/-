import java.util.Arrays;

public class exam06_select {
	public static void main(String[] args) {

		int[] arr = { 7, 4, 1, 8, 2 };

		System.out.println(Arrays.toString(arr));
//		
//		for(int k = 0; k < arr.length-1; k++) {
//			int min = arr[k];
//			int minIndex = 0;
//			
//			for (int i = k+1; i < arr.length; i++) {
//				if(min>arr[i]) {
//					min = arr[i];
//					minIndex = i;
//					}
//			}
//			int temp = arr[k];
//			arr[k] = arr[minIndex];
//			arr[minIndex] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
		
		for (int i = 0; i < arr.length-2; i++) {
			int temp = 0;
			for (int j = i; j < arr.length-1; j++) {
				if(arr[i] > arr[j+1]) {
					temp = arr[i];
					arr[j+1] = arr[i];
					arr[i] = temp;
				}
			}
			
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i]);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}
}
