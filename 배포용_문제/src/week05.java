
public class week05 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			if(i%2 == 0) {
				total -= i;
				System.out.print(-i  + " ");
			}else {
				total += i;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println(String.format("°á°ú : %d", total));
}
}
