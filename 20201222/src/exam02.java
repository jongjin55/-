import java.util.Scanner;

public class exam02 {
public static void main(String[] args) {
	
	int[] result = {1, 2, 4, 3, 2};

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
			int num = 0;
			System.out.print("입력한 답은 : ");
			for (int i = 0; i < arr2.length; i++) {
				if(result[i] == arr[i]) {
					System.out.print("O" + " ");
					num += 20;
			} else {
				System.out.print("X" + " ");
			}

		
				
			
			}
			System.out.print("총점 : " + num);
	
}

}
