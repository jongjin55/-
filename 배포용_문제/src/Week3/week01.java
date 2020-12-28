package Week3;

public class week01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println("김서방은 " + findKim(names) + "에 있다.");
		
	}

	private static String findKim(String[] names) {
		// TODO Auto-generated method stub
		
		int index = 0;
		for (int i = 0; i < names.length; i++) {
			if(names[i] == "Kim")
				index = i+1;
		}
		
		
		return index + "";
	}

}
