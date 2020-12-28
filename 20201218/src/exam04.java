
public class exam04 {
	public static void main(String[] args) {

		// 보충수업 01
		int total = 0;
		int i = 0;

		while (total <= 1000) {
			i++;
			total += i;
			
		}
		
		System.out.println(String.format("1부터 %d까지 총합 : %d", i, total));
	}
}
