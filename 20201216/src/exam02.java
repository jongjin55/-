import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사려는 상품 갯수를 입력하세요 >> ");
		int i = sc.nextInt();
		
		int  s = 10000;
		
//		 s = i >= 11 ? (int)(s*i*0.9) : s*i; 
		
		//System.out.println(String.format("가격은  %d 입니다", s));

		s = (int)(s*0.9);
	
		if(i >=1 ) 
			s *= 0.9; // 강제로 형변환 이뤄짐
		
		System.out.println ( s*i );
}
}
