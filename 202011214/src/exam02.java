
public class exam02 {
	public static void main(String[] args) {
	int num1 = 10;
	String num2 = "7";
	
	System.out.println(num1 + num2); // 숫자와 문자가 만나면 결과는 문자(형변환)
	
	String a = 10 + 7 + "";
	String b = 8 + "" + 2;
	String c = "" + 5 + 2;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println();
	
	int num3 = 7;
	int num4 = 3;
	
	
	
	System.out.println("더하기 결과 : " +  (num3 + num4));
	System.out.println("빼기 결과 : " + (num3 - num4));
	System.out.println("곱하기 결과 : " + (num3 * num4));
	System.out.println("나누기 결과 : " + ((double)num3 / num4)); // 강제 형변환
	
	//문자열 포매팅
	System.out.println(String.format("더하기 결과 : %d", num3+num4));
	System.out.println(String.format("%d %d의 합은 : %d", num3, num4, num3+num4));
	System.out.println(String.format("나눗셈 결과 : %.2f", (float)num3 / num4));
	
	}
}
