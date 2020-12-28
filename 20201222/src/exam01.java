import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr2 = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("답을 입력하세요 ");

		int k = 1;
		for (int i = 0; i < arr2.length; i++) {

			System.out.print(k + "번 답 >> ");
			int j = sc.nextInt();
			arr[i] = j;

			k++;
		}
		System.out.print("입력한 답은 : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr[i] + " ");
		}
		arr2 = arr;

		arr2[0] = 5;
		System.out.println("arr " + arr[0]);
		System.out.println("arr2 " + arr2[0]);
	}
}
