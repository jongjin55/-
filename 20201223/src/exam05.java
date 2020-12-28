
public class exam05 {
	
	// 메인 메소드 : 프로그램을 시작하는 시작점
	public static void main(String[] args) {

		// 메소드 호출(사용)
		int rs = addNumber(1, 2);
		System.out.println(rs);
	}
	// 두개의 정수를 덧셈해서 결과를 반환해주는 메소드
	//메소드 정의
	public static int addNumber(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}

