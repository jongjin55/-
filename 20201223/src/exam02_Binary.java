import java.util.Arrays;

public class exam02_Binary {
	// 이진 탐색 알고리즘
	// 선 정렬 후 사용
	public static void main(String[] args) {
		
	
	int[] array = {100, 23, 56, 7, 8, 11, 99, 32, 14, 56};
	int find = 11;
	int index = -1;
	
	int low = 0;// 탐색 범위의 최소인덱스
	int high = array.length-1; // 탐색 범위의 최대인덱스
	int mid = 0; // 탐색시 중간 인덱스

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
		System.out.println("찾는 수는 존재하지 않습니다.");
	}else {
		System.out.println(String.format("%d는 %d번째 인덱스에 존재합니다.", find, index));
	}
	
	}
	
}
