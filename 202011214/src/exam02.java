
public class exam02 {
	public static void main(String[] args) {
	int num1 = 10;
	String num2 = "7";
	
	System.out.println(num1 + num2); // ���ڿ� ���ڰ� ������ ����� ����(����ȯ)
	
	String a = 10 + 7 + "";
	String b = 8 + "" + 2;
	String c = "" + 5 + 2;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println();
	
	int num3 = 7;
	int num4 = 3;
	
	
	
	System.out.println("���ϱ� ��� : " +  (num3 + num4));
	System.out.println("���� ��� : " + (num3 - num4));
	System.out.println("���ϱ� ��� : " + (num3 * num4));
	System.out.println("������ ��� : " + ((double)num3 / num4)); // ���� ����ȯ
	
	//���ڿ� ������
	System.out.println(String.format("���ϱ� ��� : %d", num3+num4));
	System.out.println(String.format("%d %d�� ���� : %d", num3, num4, num3+num4));
	System.out.println(String.format("������ ��� : %.2f", (float)num3 / num4));
	
	}
}
