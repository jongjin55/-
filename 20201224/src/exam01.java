import java.util.Arrays;

public class exam01 {
	public static void main(String[] args) {

		// 90�� ȸ�� �Ͽ� ����ϼ���

		int[][] array = { {1,2,3,4,5},
				{6,7,8,9,10,},
				{11,12,13,14,15}, 
				{16,17,18,19,20}, 
				{21,22,23,24,25}
				
		};

		System.out.println(" �� �� ");
		for (int j = 0; j < array.length; j++) {
			System.out.println(Arrays.toString(array[j]));
		}
		
		System.out.println(" ��� ");
		
		// �������� 90 �� ȸ��
		for (int i = array[0].length-1; i >=0  ; i--) { // �� �ε���
			for (int j = 0; j < array.length; j++) {  // �� �ε���
				System.out.print(array[j][i] + "\t");
				
			}
			System.out.println();
		}
		
		// 180�� ȸ��
//		for (int i = array.length-1; i >= 0 ; i--) {
//			for (int j = array.length-1; j >= 0; j--) {
//				System.out.print(array[i][j] + " ");
//				
//			}
//			System.out.println();
//		}
	}
}
