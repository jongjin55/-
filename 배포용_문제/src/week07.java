

import java.util.Scanner;

public class week07 {
	public static void main(String[] args) {
	
		int s = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("최대공약수 & 최소공배수 구하기");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1 입력 : ");
		int i = sc.nextInt();
		System.out.print("숫자 2 입력 : ");
		int j = sc.nextInt();
		
		if(i > j) {
			for (int k = 2; k < i; k++) {
				if(i % k == 0 && j % k == 0) {
					c = (i*j)/k;
					System.out.println(String.format("최대공약수 : %d", k));
					System.out.println(String.format("최소공배수 : %d", c));
				}
		}
			} else {
				for (int k = 2; k < j; k++) {
					if(i % k == 0 && j % k == 0) {
						c = (i*j)/k;
						System.out.println(String.format("최대공약수 : %d", k));
						System.out.println(String.format("최소공배수 : %d", c));
					}
				}
			}
		}
}
