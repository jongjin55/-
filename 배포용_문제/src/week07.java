

import java.util.Scanner;

public class week07 {
	public static void main(String[] args) {
	
		int s = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("�ִ����� & �ּҰ���� ���ϱ�");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 �Է� : ");
		int i = sc.nextInt();
		System.out.print("���� 2 �Է� : ");
		int j = sc.nextInt();
		
		if(i > j) {
			for (int k = 2; k < i; k++) {
				if(i % k == 0 && j % k == 0) {
					c = (i*j)/k;
					System.out.println(String.format("�ִ����� : %d", k));
					System.out.println(String.format("�ּҰ���� : %d", c));
				}
		}
			} else {
				for (int k = 2; k < j; k++) {
					if(i % k == 0 && j % k == 0) {
						c = (i*j)/k;
						System.out.println(String.format("�ִ����� : %d", k));
						System.out.println(String.format("�ּҰ���� : %d", c));
					}
				}
			}
		}
}
