package Week2;

import java.util.Random;

public class week02_best {
	public static void main(String[] args) {


		Random rd = new Random();

		int[] array = new int[6];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(6)+1;
			
			
			
			for (int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					System.out.print(array[i]);
					i--;
				}
			
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
		}
	}
}
