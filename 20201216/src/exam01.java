import java.util.Scanner;


public class exam01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int db = sc.nextInt();
		
		System.out.print("전자계산기 구조 : ");
		int ca = sc.nextInt();
		
		System.out.print("OS : ");
		int os = sc.nextInt();
		
		System.out.print("데이터통신 : ");
		int dt = sc.nextInt();
		
		System.out.print("소프트웨어공학 : ");
		int st = sc.nextInt();
		
		int total = db + ca + os + dt + st;
		
		// 탈락 기준
		if(db < 8|| ca < 8 || os < 8 || dt < 8 || st < 8 || total < 60) {
			System.out.println("불합격입니다.!");
		} else
			System.out.println("합격입니다.!");
		
		
		// 합격 기준
		if(total >=60) {
			if(db >=8 && ca >= 8 && os >=8 && dt >=8 && st>=8) {
				System.out.println("합격입니다.!");
			} else {
				System.out.println("불합격입니다.!");
			}
		} else {
				System.out.println("불합격입니다.!");	
			}
		
		
		// 합격 축약
		
		if(total >=60 && db >=8 && ca >= 8 && os >=8 && dt >=8 && st>=8) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
