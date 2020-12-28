package Week2;

import java.util.Scanner;

public class week05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 >> ");
		int i = sc.nextInt();

		int temp =i;
		int num = 0;
		while (temp > 0) {
			temp /= 2;
			num ++;
		}
		
		int[] arr = new int[num];

		int cnt = 0;
		
		while (i != 0) {	
			
			arr[cnt] = i % 2;
			 i /= 2;

			cnt++;
		}
		for (int j=cnt-1; j >= 0; j--) {
				System.out.print(arr[j] + " ");
			
		}
	}
}
