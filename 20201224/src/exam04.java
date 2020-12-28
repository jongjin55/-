import java.util.Arrays;

public class exam04 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 3;
		
		boolean result = isDivide(num1, num2);
		
		System.out.println("결과 학인 : " + result);

		num2 = 2;
		System.out.println("결과 학인 : " + isDivide(num1, num2));
		// 5가 15의 약수인지 알고 싶어
		System.out.println("결과 학인 : " + isDivide(15, 5));
		
		// number를 넣으면 number의 약수들을 알려주는 메소드
		// 10 -> 1,2,5,10
		// 15 -> 1, 3, 5, 15
		
		int number = 10; // 약수들을 알고 싶은 숫자
		int[] array = getDivisors(number);
		
		System.out.println(Arrays.toString(array));  // 배열의 값들을 문자열로 바꿔서 출력
	}

	private static int[] getDivisors(int number) {
		int[] result = new int[number];
		
		int saveIndex = 0;  //저장되는 공간 인덱스
		// TODO Auto-generated method stub
		for (int i = 1; i <= number; i++) {
			if(number%i == 0) {
				result[saveIndex++] = i;  // 약수를 결과배열에 저장
			}
				
		}
		
		
		return result;
		// null -> 주소값을 가리키고 있지 않을 때 사용
	}

	private static boolean isDivide(int num1, int num2) {
		// TODO Auto-generated method stub
		
		if(num1 % num2 == 0)
			return true;  // return은 메소드 종료 역할도 한다. 뒤에 소스코드는 진행하지 않는다.
		else // 약수 x
			return false;
	}
}
