import java.util.Arrays;

public class exam02_Binary {
	// ���� Ž�� �˰���
	// �� ���� �� ���
	public static void main(String[] args) {
		
	
	int[] array = {100, 23, 56, 7, 8, 11, 99, 32, 14, 56};
	int find = 11;
	int index = -1;
	
	int low = 0;// Ž�� ������ �ּ��ε���
	int high = array.length-1; // Ž�� ������ �ִ��ε���
	int mid = 0; // Ž���� �߰� �ε���

	Arrays.sort(array);

	System.out.println(Arrays.toString(array));
	
	while (low <= high) {
		mid = (low+ high)/2;
		
		if(find == array[mid]) {
			index = mid;
			break;
		}else if(find > array[mid]) {
			low = mid+1;
			
		}else if(find < array[mid]) {
			high = mid-1;
		}
	}
	if(index == -1) {
		System.out.println("ã�� ���� �������� �ʽ��ϴ�.");
	}else {
		System.out.println(String.format("%d�� %d��° �ε����� �����մϴ�.", find, index));
	}
	
	}
	
}
