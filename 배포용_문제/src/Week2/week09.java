package Week2;

import java.util.Arrays;

public class week09 {
	public static void main(String[] args) {


		int[][] array = { {1,2,3,4,5},
				{6,7,8,9,10,},
				{11,12,13,14,15}, 
				{16,17,18,19,20}, 
				{21,22,23,24,25}};
		
		System.out.println(" 원 본 ");
		for (int j = 0; j < array.length; j++) {
			System.out.println(Arrays.toString(array[j]));
		}
		
		System.out.println(" 결과 ");
		
		for (int i = array.length-1; i >= 0 ; i--) {
			for (int j = array.length-1; j >= 0; j--) {
				System.out.print(array[i][j] + "\t");
				
			}
			System.out.println();
		}
	}
}
