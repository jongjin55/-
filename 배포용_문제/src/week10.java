import java.util.Scanner;

public class week10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.print("A �Է� : ");
			int i = sc.nextInt();
			System.out.print("B �Է� : ");
			int j = sc.nextInt();

			System.out.println(String.format("��� >> %d", i - j));

			if (i ==0 && j == 0)
				break;

		}
	}
}
