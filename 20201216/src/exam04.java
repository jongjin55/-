import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
	//월을 입력하면 계절을 알려주는 프로그램을 만들자
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("월 입력 >> ");
		
		String userMsg = sc.next();
	
		String a = "";
		
		switch (userMsg) {
			case  "1" :
			case  "2" :
			case  "12" :
				a = "겨울";
				break;
			case  "3" :
			case  "4" :
			case  "5" :
				a = "봄";
				break;
			case  "6" :
			case  "7" :
			case  "8" :
				a = "여름";
				break;
			case  "9" :
			case  "10" :
			case  "11" :
				a = "가을";
				break;
			default:
				break;
		}
		System.out.println(String.format("%s월은  %s입니다.!", userMsg, a));
}
}
