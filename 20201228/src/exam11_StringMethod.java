import java.util.Scanner;

public class exam11_StringMethod {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("제시어 >> ");
		String word1 = sc.next();
	
		while(true) {
		
			System.out.print("단어를 입력해주세요 >> ");	
			String word2 = sc.next();
			
			//string 사용
			// 끝 글자를 알아내는 법
			if ( !word1.substring(word1.length()-1).equals(word2.substring(0, 1))){
				break;
			}else {
				word1 = word2;
			}
			
			// charAt()
			// != 기본 자료형만 가능
			if(word1.charAt(word1.length()-1) != word2.charAt(0)) {
				break;
			} else {
				word1 = word2;
			}
			
			//endswith
			if(!word1.endsWith(word2.substring(0,1))) {
				break;
			} else {
				word1 = word2;
			}
		}
		System.out.println("게임이 종료되었습니다.!");
	}
}
