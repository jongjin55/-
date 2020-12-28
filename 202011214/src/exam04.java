import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
	// Scanner는 사용자정의 데이터타입 -> 특정 값들을 읽어 들일 때 사용
		Scanner sc = new Scanner(System.in);
		
//		int input = sc.nextInt();
//		System.out.println(input);
//		
//		int input2 = sc.nextInt();
//		System.out.println(input2);
		
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		
	
	
		int num3 = totalSecond / 3600;
		int num2 = (totalSecond / 60) % 60;  //  % (60*60) / 60
		int num1 = totalSecond % 60;
		
		System.out.println(num3 + "시 " +num2 + "분 " + num1 + "초");
		System.out.println(String.format("%d시  %d초 %d 분 ", num3, num2, num1));
		
		
		
	}
}
