
public class exam01_����Ž�� {
	public static void main(String[] args) {

		// sequential Search ���� Ž�� �˰���
		int[] array = {100, 23, 56, 7, 8, 11, 99, 32, 14, 56};
		
		int find = 200 ;  //ã���� �ϴ� ��
		int index = -1;  // ã���� �ϴ� ���� �ε���
		
		for (int i = 0; i < array.length; i++) {
			if(find == array[i]) {
				index = i;
				break;
			}		
		}

		if(index == -1) {
			System.out.println("ã�� ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(String.format("%d�� %d��° �ε����� �����մϴ�.", find, index));
		}
	}
}
