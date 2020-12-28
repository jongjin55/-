import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		// 0~100 까지 숫자 입력 가능
		Scanner sc = new Scanner(System.in);
		
		int j= 0;
		int total = 0;
		float avg = 0;
		int cnt = 0;
		/*		
		while (true) {
		
			System.out.print("숫자를 입력하세요 : ");
			j = sc.nextInt();
			
			if(j>=0 && j <= 100) {
				total += j;
				cnt += 1.0;
			}
			break;
		}*/
		
		while (j >= 0 && j <= 100) {
			
			total += j;
	
			System.out.println("숫자 입력 : ");
			j = sc.nextInt();
			cnt++;		
		}
		
		
		avg = total/(float)--cnt;
		
		System.out.println(String.format("합계 : %d 평균 : %f", total, avg));
		
	}
	
}
