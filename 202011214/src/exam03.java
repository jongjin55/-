import java.util.Scanner;


public class exam03 {
	public static void main(String[] args) {
	
		int num = 771;
		
		System.out.println(num-(num%100));
		System.out.println((num/100)*100);

		//1의 자리로 1로 변경해보자
		System.out.println((num- (num%10)) + 1);
		System.out.println((num/10)*10 + 1);
		
		
		
		
		
	}
}