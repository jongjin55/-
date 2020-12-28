import java.util.Arrays;
import java.util.Scanner;

public class exam07_보충 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] id = new String[3];
		String[] pw = new String[3];

		int cnt = 0;

		while (true) {

			System.out.println("1.회원가입  2. 로그인 3. 종료");
			int q = sc.nextInt();

			switch (q) {

			case 1:

				if(cnt < 3) {
				System.out.print("id : ");
				id[cnt] = sc.next();
				System.out.print("pw : ");
				pw[cnt] = sc.next();
				cnt++;
				System.out.println("가입성공");
				}else {
					System.out.println("가입불가");
					break;
				}
				break;

			case 2:
				System.out.print("id : ");
				String j = sc.next();
				if (id[0].equals(j) || id[1].equals(j) || id[2].equals(j)) {
					System.out.print("pw : ");
					String p = sc.next();
					if (pw[0].equals(p) || pw[1].equals(p) || pw[2].equals(p)) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패");
					}
				} else
					System.out.println("존재하지 않는 아이디입니다.");

				break;
			case 3:
				System.out.println("프로그램 종료");
				break;

			}
			if (q == 3)
				break;
		}

		System.out.println(Arrays.toString(id));
		System.out.println(Arrays.toString(pw));
	}
}
