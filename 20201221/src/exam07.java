import java.util.Scanner;

public class exam07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = {"손지영", "최성우", "황해도", "최태양"};
		
		System.out.print("검색하고 싶은 이름을 입력하세요 >> ");
		String find = sc.next();  // 검새하려는 이름을 문자열 타입으로 입력

		//순차탐색 알고리즘 : 순차적으로 데이터의 0번째부터 끝번째까지 탐색하는 방법
		// 사용자 정의 타입들은 모두 주소값을 저장하고 있다
		// 배열, 문자열  >> equal을 사용해야 한다.  주소값이 아니라 해당문자를 비교하겠다.
		for (int i = 0; i < names.length; i++) {
			if(find.equals(names[i])) {
				System.out.println(String.format("%s님은 %d번째에 있습니다.", find, i+1));
			}
		}
	}

}
