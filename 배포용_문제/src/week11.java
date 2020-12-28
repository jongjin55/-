import java.util.Scanner;

public class week11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n ют╥б : ");
		int n = sc.nextInt();
		
		int i = 1;
		int j = 1;
		
		while ( n > 0 ) {
			System.out.print(i +" ");
			i += j;
			j++;
			n--;
		}
	}
}
