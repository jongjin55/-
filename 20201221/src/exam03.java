import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
		// 정수형 배열 생성
		// 크기는 10칸
		// 각칸마다 1~20 사이의 숫자로 초기화
		Random rd = new Random();
		
		int j = 0;
		int[] arrayint;
		arrayint = new int[10];

		int[] array2 = { 1, 19, 15, 3, 6, 17, 20, 9, 4, 11 };

		for (int i = 0; i < arrayint.length; i++) {
			arrayint[i] = rd.nextInt(20)+1;
		}
		System.out.println(arrayint[1]);// 인덱스까지 작성해야 해당 칸에 있는 값을 확인가능하다
		System.out.println(arrayint);//레퍼런스 변수를 출력하면 주소가 나온다.
		System.out.println(Arrays.toString(arrayint));  // 배열을 문자열로 변환

	}
}
