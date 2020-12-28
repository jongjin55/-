import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
	// 자판기 프로그램
		
		System.out.print("금액을 입력하세요 >> ");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		System.out.println("메뉴를 고르세요 .");
		System.out.print("1. 콜라(800원), 2. 생수(500원), 3. 비타민워터(1500) >> ");
		
		int j = sc.nextInt();

		int k = 0;
		
		switch (j) {
		case 1:
			k = 800;	
			break;
		case 2:
			k = 500;
			break;
		case 3:
			k = 1500;
//			i-= 1500
			break;
		default:
			System.out.println("다시 선택해 주세요!!");
			break;
		}
		
		int o = i-k;
		
		if(i<k) {
			System.out.println("돈이 부족합니다ㅠㅠ");
			System.out.println(String.format("잔 돈 >> %d", i));
		} else {
			System.out.println(String.format("잔 돈 >> %d", o));
			System.out.println(String.format("천 원 : %d개", o/1000 ));
			System.out.println(String.format("오백원 : %d개", o%1000/500));
			System.out.println(String.format("백 원: %d개", o%1000 %500/100));
		}
		}
}
