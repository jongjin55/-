import java.util.Scanner;

public class week_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int i = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int j= sc.nextInt();
		
		int m = i*(j%10);
		int n = i*((j%100)/10);
		int l = i*(j/100);
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(l);
		System.out.println(i*j);
	}
}
