import java.util.Scanner;

public class exam05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		if(age >= 20)
			System.out.println("성인입니다.");
		else 
			System.out.println("미성년자입니다.");
	
	}

}
