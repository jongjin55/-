
public class exam04 {

	//메소드 오버로딩 over loading
	// 똑같은 이름의 메소드를 여러개  정의 -> 비슷한 기능이지만 약간 다른 옵션을 적용해서 메소드를 사용하도록 도와줌
	// 오버로딩 성립 조건
	// 1. 메소드 이름이 동일
	// 2. 매개변수의 갯수, 매개변수의 데이터 타입이 달라야 한다.
	public static void main(String[] args) {
		
		int result = add(1, 2, 3);
		System.out.println(result);
		System.out.println();
		
		double result2 = add(5.3, 2.7);
		System.out.println(result2);
	}

	private static double add(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
	}

	private static int add(int i, int j, int e) {
		// TODO Auto-generated method stub
		return i+j+e;
	}
}
