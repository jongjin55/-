
public class exam02 {

	public static void main(String[] args) {
		
		int[] arr = {15, 10, 2, 8, 23};
		
		System.out.println(String.format("%.1f", average(arr)));
	}

	private static double average(int[] arr) {
		// TODO Auto-generated method stub
		double total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		return total / arr.length;
	}
}
