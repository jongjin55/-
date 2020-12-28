import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("농구공의 개수  : " );
		
		int i = sc.nextInt();
		
		int a = i/5;
		int b = i%5 == 0 ?  a : a+1;
		
		System.out.println("상자의 개수 : " + b);
}
}
