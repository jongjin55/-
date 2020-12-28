import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int i = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int j = sc.nextInt();
		
		int cnt = 1;
		int result = 0;
		
		//더하는 형식
		 while ((i-result) > j ) {
			System.out.print(String.format("%d주차 감량 몸무게 : ", cnt++));
			int k = sc.nextInt();
			result = k + result;	
		}
		 //빼는 형식
		 while (i > j ) {
				System.out.print(String.format("%d주차 감량 몸무게 : ", cnt++));
				int k = sc.nextInt();
				i = i - k;	
			}
		
		System.out.println(String.format("%dkg 달성!! 축하합니다", i-result));
}
}
