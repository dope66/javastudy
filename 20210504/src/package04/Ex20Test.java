package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> map = new HashMap<String, Student>();

		Student std = new Student("1q2w3e4r", "������");
		map.put("qhsqn", std);
		std = new Student("1q2w3e", "������");
		map.put("qhsqn1", std);
		std = new Student("1q2w", "������");
		map.put("qhsqn2", std);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ��� ");
			System.out.print("ID : ");
			String id = sc.nextLine();

			System.out.print("Password : ");
			String pw = sc.nextLine();
			if (map.containsKey(id)) {
				Student std1 = map.get(id);
				if (std1.sno.equals(pw)) {
					System.out.println("�α����� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�.");
				}
			} else {
				System.out.println("���̵� ���� ���� �ʽ��ϴ�.");
			}
		}
	}
}
