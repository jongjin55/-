import java.util.Scanner;

public class exam11_StringMethod {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���þ� >> ");
		String word1 = sc.next();
	
		while(true) {
		
			System.out.print("�ܾ �Է����ּ��� >> ");	
			String word2 = sc.next();
			
			//string ���
			// �� ���ڸ� �˾Ƴ��� ��
			if ( !word1.substring(word1.length()-1).equals(word2.substring(0, 1))){
				break;
			}else {
				word1 = word2;
			}
			
			// charAt()
			// != �⺻ �ڷ����� ����
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
		System.out.println("������ ����Ǿ����ϴ�.!");
	}
}
