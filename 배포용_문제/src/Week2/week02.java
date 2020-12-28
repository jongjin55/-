package Week2;

import java.util.Random;

public class week02 {
	public static void main(String[] args) {

		Random rd = new Random();

		int[] array = new int[6];
		int[] arr = new int[6];
			
	
		for (int i = 0; i < arr.length; i++) {
			array[i] = rd.nextInt(6) + 1;
			for (int j = 0; j < arr.length; j++) {
				if(i != j) {
					while(array[i] == array[j]) {
						array[i] = rd.nextInt(6)+1;
						
					}
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(array[i] + " ");
			
		}
		
		
		
		}
		



}
