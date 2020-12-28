import java.util.Scanner;

public class exam06 {
	public static void main(String[] args) {
	// number 변수가 양수인지 음수인지 0인지 구분하는 프로그램
		int number = 10;
		
		if(number>0)
			System.out.println("양수");
		else if(number <0)
			System.out.println("음수");
		else
			System.out.println("0");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("============ 입장료 프로그램 =============");
		System.out.print("나이를 말씀해주세요 : ");
		int i = sc.nextInt();
		
		System.out.print("인원수를 말씀해주세요 : ");
		int j = sc.nextInt();
	
		int result = 5000;
		
		
		if(i < 20)
			System.out.println(String.format("총 %d원입니다", (result/2)*j));
		else
			System.out.println(String.format("총 %d원입니다",  (result * j)));
			
}
}
