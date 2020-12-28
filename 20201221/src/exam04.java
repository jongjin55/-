import java.util.Arrays;
import java.util.Random;

public class exam04 {
	public static void main(String[] args) {

		Random rd = new Random();
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(10)+1;	
		}
	
			System.out.println(Arrays.toString(array));
			
			System.out.println(array[1] + array[4]);
			
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			System.out.println(sum);
			
			System.out.println((double)sum/array.length);
			
	}
}
