import java.util.Arrays;

public class exam06 {
	public static void main(String[] args) {

		// 2개 배열 병합하기
		int A[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int B[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		int Merge[] = mergeArray(A, B);
		
		System.out.println("Merge : " + Arrays.toString(Merge));

	}

	private static int[] mergeArray(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int[] result = new int[a.length + b.length];

//		System.out.println(result);
		for (int i = 0; i < b.length; i++) {
			result[i] = b[i];
			result[i+ a.length] = a[i];
		}
		
//		for (int i = a.length; i < result.length; i++) {
//			result[i] = a[i-a.length];
//		}
		//정렬알고리즘
		Arrays.sort(result);

		return result;
	}
}
