package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> map = new HashMap<String, Student>();

		Student std = new Student("1q2w3e4r", "김현우");
		map.put("qhsqn", std);
		std = new Student("1q2w3e", "이현우");
		map.put("qhsqn1", std);
		std = new Student("1q2w", "최현우");
		map.put("qhsqn2", std);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요 ");
			System.out.print("ID : ");
			String id = sc.nextLine();

			System.out.print("Password : ");
			String pw = sc.nextLine();
			if (map.containsKey(id)) {
				Student std1 = map.get(id);
				if (std1.sno.equals(pw)) {
					System.out.println("로그인이 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 틀립니다.");
				}
			} else {
				System.out.println("아이디가 존재 하지 않습니다.");
			}
		}
	}
}
