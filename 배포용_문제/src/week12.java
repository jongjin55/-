import java.util.Scanner;

public class week12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Çà °³¼ö : ");
		int i = sc.nextInt();
		
		while(i > 0) {
			
			int j = i;
			
			while( j > 0) {
			System.out.print("*");
			j--;
			}
			
			System.out.println("");
			i--;
		}
	}
}
