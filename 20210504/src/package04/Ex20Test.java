package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> map = new HashMap<String, Student>();

		Student std = new Student("1234567", "김현우");
		map.put("id", std);
		std = new Student("167", "이현우");
		map.put("id1", std);
		std = new Student("7", "최현우");
		map.put("id2", std);

		Scanner sc = new Scanner(System.in);
		while(true)
		{
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
