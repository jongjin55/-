import java.util.ArrayList;

public class exam07_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ArrayList ����
		ArrayList<String> a = new ArrayList<String>(7);
		
		// �ʱ�ũ�� ������ (10) <- ���� �ڵ� ����
		ArrayList<String> a2 = new ArrayList<String>();
		
		// 2. ��һ���
		a.add("Hello");
		a.add("Hi");
		a.add("Java");
		
		//3. ��� ����
		int n = a.size();
		
		System.out.println(n);
		
		// 4. ��� �߰� ����
		a.add(2,"Python");
		System.out.println(a.get(2));
		
		System.out.println(a.size());
		
		//5. ��� �˾Ƴ���
		System.out.println(a.get(1));
		
		//6. ��� ����
		a.remove(1);
		System.out.println(a.get(1));
		
		// 7. ��� ��� ����
		System.out.println(a.size());
		a.clear();
		System.out.println(a.size());
		
	}

}
