
public class exam04 {

	//�޼ҵ� �����ε� over loading
	// �Ȱ��� �̸��� �޼ҵ带 ������  ���� -> ����� ��������� �ణ �ٸ� �ɼ��� �����ؼ� �޼ҵ带 ����ϵ��� ������
	// �����ε� ���� ����
	// 1. �޼ҵ� �̸��� ����
	// 2. �Ű������� ����, �Ű������� ������ Ÿ���� �޶�� �Ѵ�.
	public static void main(String[] args) {
		
		int result = add(1, 2, 3);
		System.out.println(result);
		System.out.println();
		
		double result2 = add(5.3, 2.7);
		System.out.println(result2);
	}

	private static double add(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
	}

	private static int add(int i, int j, int e) {
		// TODO Auto-generated method stub
		return i+j+e;
	}
}
