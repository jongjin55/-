import java.util.Arrays;

public class exam04 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		
		int k = 21;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		
		System.out.println(Arrays.toString(arr[0]));
		
		/*
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		*/
	}
}
