import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
		int i = 3;
		int j = 10;
		
		System.out.println(i==j ? "같다" : "다르다");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int k = sc.nextInt();
		
		String a = k%2==0 ? "짝수" : "홀수";
		System.out.println(k + "는(은) " + a + "입니다");
		System.out.println(String.format("%d는(은) %s입니다", k, a));
		System.out.println(String.format("%d는(은) %s입니다", k, k%2 == 0 ? "짝수" : "홀수"));
	}
}
