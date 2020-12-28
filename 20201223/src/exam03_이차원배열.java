
public class exam03_이차원배열 {
	public static void main(String[] args) {

		// 2차원 배열 만들기
		int[][] arr = new int[5][3]; // 5행3열 2차원 배열 생성
		System.out.println(arr[0].length);
		
		int[][] arr2 = new int[5][5];
		
		int k = 1;
		for (int i = 0; i < arr2.length; i++) {  // 행 인덱스 제어
			for (int j = 0; j < arr2[i].length; j++) {  //열 인덱스 제어
				arr2[i][j] = k++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
