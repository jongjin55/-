
public class exam09_StringMethod {

	public static void main(String[] args) {
		
		String data = "여러분 잘 쉬셨나요?";
	
		
		// 1. subString : 문자열을 잘라서 리턴
		// 반환 타입이 String 임
		System.out.println(data.substring(0,3));
		
		// 1-1. 시작 index만 지정
		System.out.println(data.substring(6));
		
		// 오류 ~!!!   자바에서는 -1 은  없음
//		System.out.println(data.substring(3, -1));
		
		//2. charAt : 해당 인덱스의 문자 리턴
		// 반환 타입이 char 임
		char data2 = data.charAt(4);
		
		System.out.println(data2);
		
		String data3 = "여러분 잘 쉬셨나요? 잘 지냈나요?";
		//3. indexOf : 문자의 위치를 리턴
		System.out.println(data.indexOf("잘"));
		int index = data.indexOf("잘");
		
		// 첫번째 문자 위치만 반환
		System.out.println(data3.indexOf("잘"));
		
		// 4. contains : 해당 문자를 포함하는지 아닌지 반환
		// Boolean
		System.out.println(data.contains("?"));
		System.out.println(data.contains("!"));
		
		// 5. endswith : 매개변수로 받은 문자열로 문장이 끝나는지를 리턴
		// Boolean
		String data4 = "Hello.txt";
		System.out.println(data4.endsWith(".txt"));
		System.out.println(data.endsWith("!"));
		
		// 6. replace : 문자열을 새로운 문자열로 바꾼 문자열을 리턴
		System.out.println(data.replace("잘", "못"));
		// 데이터 자체를 바꾸고 싶다면 다시 값을 넣어줘야 함
		System.out.println(data);
		
		data = data.replace("잘", "못");
		System.out.println(data);
		
		String data5 = "Hello World!";
		// 7. toLowerCase : 모든 문자를 소문자로 변환 
		// toUpperCase : 모든 문자를 대문자로 변환
		System.out.println(data5.toLowerCase());
		System.out.println(data5.toUpperCase());
		
		// 9. length : 문자열의 길이
		System.out.println(data5.length());
		
		// 10. concat : 문자열을 합쳐줌
		System.out.println(data5.concat(data4));
		
//		String  f1 누르면 help 얻을 수 있음
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
