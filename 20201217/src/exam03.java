import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ : ");
		int i = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int j = sc.nextInt();
		
		int cnt = 1;
		int result = 0;
		
		//���ϴ� ����
		 while ((i-result) > j ) {
			System.out.print(String.format("%d���� ���� ������ : ", cnt++));
			int k = sc.nextInt();
			result = k + result;	
		}
		 //���� ����
		 while (i > j ) {
				System.out.print(String.format("%d���� ���� ������ : ", cnt++));
				int k = sc.nextInt();
				i = i - k;	
			}
		
		System.out.println(String.format("%dkg �޼�!! �����մϴ�", i-result));
}
}
