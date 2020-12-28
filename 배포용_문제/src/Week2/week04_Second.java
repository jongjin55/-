package Week2;

public class week04_Second {
	public static void main(String[] args) {

	int[] point = {92, 32, 52, 9, 81, 2, 68};
	
	int i = 0;
	int j = 0;
	
	int minIndex1 = 0;
	int minIndex2 = 1;
	
	int min = Math.abs(point[0] - point[1]);
	
	for (i = 0; i < point.length; i++) {
		for (j = i+1; j < point.length; j++) {
			if(Math.abs(point[i] - point[j]) < min) {
				min = point[i] - point[j];
				minIndex1 = i;
				minIndex2 =j;
			}
			
		}
		
	}
	System.out.println(String.format("result = [ %d, %d ] ", minIndex1, minIndex2));
	}
}
