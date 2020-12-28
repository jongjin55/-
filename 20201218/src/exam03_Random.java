import java.util.Random;
import java.util.Scanner;

public class exam03_Random {
	public static void main(String[] args) {
		// 난수 생성
		Random random = new Random(); // 난수를 만드는 사용자정의 데이터 타입 변수만들기
		Scanner sc = new Scanner(System.in);
		// ()안에 숫자를 넣어주면 범위가 지정 됨 예) (20)이면 0~19까지 난수 생성 // (20)+1 1~20
		// 만약 100~200 사이라면 (101)+100
		int num1;
		int num2;
		int j;

		System.out.println("==Plus Game==");

		for (int i = 0; i < 5; i++) {

			num1 = random.nextInt(20) + 1;
			num2 = random.nextInt(20) + 1;

			for (int k = 0; k < 3; k++) {
				System.out.print(String.format("%d + %d = ", num1, num2));
				j = sc.nextInt();

				if (num1 + num2 == j) {
					System.out.println("Success");
					break;
				} else {
					System.out.println("Fail");
				}
			}
		}
	}

}
