
public class exam02 {
	public static void main(String[] args) {
		
		// 1. 배열 생성
		long[] longArray = new long[3];
		
		double[] doubleArray = {10.2, 15.3, 189.1};

//		2. 레퍼런스 변수 활용
		
		long[] a;
		a = longArray;
		
		a[1]++;
		
		System.out.println(longArray[1]);

		System.out.println(longArray.length);
	}

}
