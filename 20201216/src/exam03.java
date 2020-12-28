import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
	// 간단한 챗봇을 만들자
		Scanner sc= new Scanner(System.in);
		System.out.print("문장을 입력하세요 >> ");
		
		String userMsg = sc.next(); // 문자열을 입력받는 기능
		
		// 안녕하세요, 반가워요, 수고하세요, other 잘못입력하였습니다
		switch (userMsg) {
		case "안녕하세요" :
			System.out.println("네, 안녕하세요");
			break;
		case "반가워요" :
			System.out.println("네, 반가워요~");
			break;
		case "수고하세요" :
			System.out.println("네, 수고하세요!!");
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
			break;
		}
		
}
}
