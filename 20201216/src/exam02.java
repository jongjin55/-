import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ��ǰ ������ �Է��ϼ��� >> ");
		int i = sc.nextInt();
		
		int  s = 10000;
		
//		 s = i >= 11 ? (int)(s*i*0.9) : s*i; 
		
		//System.out.println(String.format("������  %d �Դϴ�", s));

		s = (int)(s*0.9);
	
		if(i >=1 ) 
			s *= 0.9; // ������ ����ȯ �̷���
		
		System.out.println ( s*i );
}
}
