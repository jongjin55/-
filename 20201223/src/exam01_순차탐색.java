
public class exam01_순차탐색 {
	public static void main(String[] args) {

		// sequential Search 순차 탐색 알고리즘
		int[] array = {100, 23, 56, 7, 8, 11, 99, 32, 14, 56};
		
		int find = 200 ;  //찾고자 하는 수
		int index = -1;  // 찾고자 하는 수의 인덱스
		
		for (int i = 0; i < array.length; i++) {
			if(find == array[i]) {
				index = i;
				break;
			}		
		}

		if(index == -1) {
			System.out.println("찾는 수는 존재하지 않습니다.");
		}else {
			System.out.println(String.format("%d는 %d번째 인덱스에 존재합니다.", find, index));
		}
	}
}
