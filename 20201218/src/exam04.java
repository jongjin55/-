
public class exam04 {
	public static void main(String[] args) {

		// ������� 01
		int total = 0;
		int i = 0;

		while (total <= 1000) {
			i++;
			total += i;
			
		}
		
		System.out.println(String.format("1���� %d���� ���� : %d", i, total));
	}
}
