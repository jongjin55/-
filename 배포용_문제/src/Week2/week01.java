package Week2;

import java.util.Random;

public class week01 {
	public static void main(String[] args) {
	
		Random rd =new Random();
		
		int[] array = new int[8];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(20)+1;	
		}
		
		int max, min;
		max = min = array[0];
		
		System.out.print("�迭�� �ִ� ��� �� : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);
		
		
	}
}
