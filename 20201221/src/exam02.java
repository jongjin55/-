
public class exam02 {
	public static void main(String[] args) {
		
		// 1. �迭 ����
		long[] longArray = new long[3];
		
		double[] doubleArray = {10.2, 15.3, 189.1};

//		2. ���۷��� ���� Ȱ��
		
		long[] a;
		a = longArray;
		
		a[1]++;
		
		System.out.println(longArray[1]);

		System.out.println(longArray.length);
	}

}
