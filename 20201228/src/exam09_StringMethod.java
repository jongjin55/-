
public class exam09_StringMethod {

	public static void main(String[] args) {
		
		String data = "������ �� ���̳���?";
	
		
		// 1. subString : ���ڿ��� �߶� ����
		// ��ȯ Ÿ���� String ��
		System.out.println(data.substring(0,3));
		
		// 1-1. ���� index�� ����
		System.out.println(data.substring(6));
		
		// ���� ~!!!   �ڹٿ����� -1 ��  ����
//		System.out.println(data.substring(3, -1));
		
		//2. charAt : �ش� �ε����� ���� ����
		// ��ȯ Ÿ���� char ��
		char data2 = data.charAt(4);
		
		System.out.println(data2);
		
		String data3 = "������ �� ���̳���? �� ���³���?";
		//3. indexOf : ������ ��ġ�� ����
		System.out.println(data.indexOf("��"));
		int index = data.indexOf("��");
		
		// ù��° ���� ��ġ�� ��ȯ
		System.out.println(data3.indexOf("��"));
		
		// 4. contains : �ش� ���ڸ� �����ϴ��� �ƴ��� ��ȯ
		// Boolean
		System.out.println(data.contains("?"));
		System.out.println(data.contains("!"));
		
		// 5. endswith : �Ű������� ���� ���ڿ��� ������ ���������� ����
		// Boolean
		String data4 = "Hello.txt";
		System.out.println(data4.endsWith(".txt"));
		System.out.println(data.endsWith("!"));
		
		// 6. replace : ���ڿ��� ���ο� ���ڿ��� �ٲ� ���ڿ��� ����
		System.out.println(data.replace("��", "��"));
		// ������ ��ü�� �ٲٰ� �ʹٸ� �ٽ� ���� �־���� ��
		System.out.println(data);
		
		data = data.replace("��", "��");
		System.out.println(data);
		
		String data5 = "Hello World!";
		// 7. toLowerCase : ��� ���ڸ� �ҹ��ڷ� ��ȯ 
		// toUpperCase : ��� ���ڸ� �빮�ڷ� ��ȯ
		System.out.println(data5.toLowerCase());
		System.out.println(data5.toUpperCase());
		
		// 9. length : ���ڿ��� ����
		System.out.println(data5.length());
		
		// 10. concat : ���ڿ��� ������
		System.out.println(data5.concat(data4));
		
//		String  f1 ������ help ���� �� ����
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
