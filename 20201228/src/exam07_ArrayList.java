import java.util.ArrayList;

public class exam07_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ArrayList 생성
		ArrayList<String> a = new ArrayList<String>(7);
		
		// 초기크기 미지정 (10) <- 으로 자동 지정
		ArrayList<String> a2 = new ArrayList<String>();
		
		// 2. 요소삽입
		a.add("Hello");
		a.add("Hi");
		a.add("Java");
		
		//3. 요소 개수
		int n = a.size();
		
		System.out.println(n);
		
		// 4. 요소 중간 삽입
		a.add(2,"Python");
		System.out.println(a.get(2));
		
		System.out.println(a.size());
		
		//5. 요소 알아내기
		System.out.println(a.get(1));
		
		//6. 요소 삭제
		a.remove(1);
		System.out.println(a.get(1));
		
		// 7. 모든 요소 삭제
		System.out.println(a.size());
		a.clear();
		System.out.println(a.size());
		
	}

}
