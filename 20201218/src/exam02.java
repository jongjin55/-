import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		// 0~100 ���� ���� �Է� ����
		Scanner sc = new Scanner(System.in);
		
		int j= 0;
		int total = 0;
		float avg = 0;
		int cnt = 0;
		/*		
		while (true) {
		
			System.out.print("���ڸ� �Է��ϼ��� : ");
			j = sc.nextInt();
			
			if(j>=0 && j <= 100) {
				total += j;
				cnt += 1.0;
			}
			break;
		}*/
		
		while (j >= 0 && j <= 100) {
			
			total += j;
	
			System.out.println("���� �Է� : ");
			j = sc.nextInt();
			cnt++;		
		}
		
		
		avg = total/(float)--cnt;
		
		System.out.println(String.format("�հ� : %d ��� : %f", total, avg));
		
	}
	
}
