
public class exam03_�������迭 {
	public static void main(String[] args) {

		// 2���� �迭 �����
		int[][] arr = new int[5][3]; // 5��3�� 2���� �迭 ����
		System.out.println(arr[0].length);
		
		int[][] arr2 = new int[5][5];
		
		int k = 1;
		for (int i = 0; i < arr2.length; i++) {  // �� �ε��� ����
			for (int j = 0; j < arr2[i].length; j++) {  //�� �ε��� ����
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
