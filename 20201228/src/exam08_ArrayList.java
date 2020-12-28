import java.util.ArrayList;
import java.util.Scanner;

public class exam08_ArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();

		while (true) {
			System.out.print("[1] 노래추가  [2] 노래 삭제  [3] 종료 >> ");
			int menu = sc.nextInt();

//			System.out.println("========== 현재 재생 목록 ==========");
//			if (arr.size() == 0)
//				System.out.println("재생 목록이 없습니다.");
//			else {
//				for (int i = 0; i < arr.size(); i++) {
//					System.out.println((i + 1) + ". " + arr.get(i));
//				}
//			}
//			System.out.println("==============================");

			if (menu == 1) {
				System.out.println("========== 현재 재생 목록 ==========");
				if (arr.size() == 0)
					System.out.println("재생 목록이 없습니다.");
				else {
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i + 1) + ". " + arr.get(i));
					}
				}
				System.out.println("==============================");
				System.out.print("[1] 마지막위치에 추가 [2] 원하는 위치에 추가 >> ");
				menu = sc.nextInt();

					if (menu == 1) {
						System.out.print("추가할 노래 입력 : ");
						String title = sc.next();
						arr.add(title);
						System.out.println("추가가 완료되었습니다.");
					} else {
						System.out.print("추가할 노래 입력 : ");
						String title = sc.next();
						System.out.print("추가할 위치 입력 >> ");
						int j = sc.nextInt();
						arr.add(j - 1, title);
	
						System.out.println("추가가 완료되었습니다.");
					}

				System.out.println();
			} else if (menu == 2) {

				System.out.println("========== 현재 재생 목록 ==========");
				if (arr.size() == 0)
					System.out.println("재생 목록이 없습니다.");
				else {
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i + 1) + ". " + arr.get(i));
					}
				}
				System.out.println("==============================");
				
					if (arr.size() != 0) {
						System.out.print("[1] 선택삭제 [2] 전체삭제 >> ");
						menu = sc.nextInt();
						if (menu == 1) {
							System.out.print("삭제할 노래 선택 >> ");
							int i = sc.nextInt();
							arr.remove(i - 1);
							System.out.println("노래가 삭제되었습니다.");
						} else {
							arr.clear();
							System.out.println("노래가 전체삭제되었습니다.");
						}
					}
			}

			if (menu == 3)
				break;
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
