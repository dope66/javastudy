import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01Tset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Account> map = new HashMap<String, Account>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("���µ��: 1\t|�Ա� : 2 \t|��� : 3 \t|������� : 4 \t|���� : 5");
			System.out.print("��ȣ�� �����ϼ��� > ");
			String num = sc.nextLine();//num�� String ���� �ϸ� �Ѿ���� �ƴϸ�sc.nextline�����ؾߵȴ� 
			switch (num) {
			case "1":
				System.out.println("���µ�� ȭ��");
				System.out.print("���� ��ȣ�� ����ϼ��� > ");
				String accnum = sc.nextLine();
				System.out.print("�ʱ� �Ա� �ݾ��� �������� > ");
				Integer money = sc.nextInt(); sc.nextLine();
				System.out.print("���� ���� �̸� �Է� > ");
				String name = sc.nextLine();
				Account acc = new Account(accnum, money, name);
				map.put(accnum, acc);
				break;
			case "2":
				System.out.println("�Ա�ȭ�� ");
				System.out.print("�Ա��� ���¸� �Է����ּ���  >");
				accnum = sc.nextLine();
				System.out.print("�Ա� �ݾ��� �Է����ּ��� > ");
				money = sc.nextInt();
				sc.nextLine();
				acc = map.get(accnum);
				acc.setDeposit(money);
				break;
			case "3":
				System.out.println("���ȭ�� ");
				System.out.println("��� ���¸� �Է����ּ��� > ");
				accnum = sc.nextLine();/* enter���� ������ */
				System.out.println("��� �ݾ��� �Է����ּ��� > ");
				money = sc.nextInt();
				sc.nextLine();
				acc = map.get(accnum);
				acc.setWithdraw(money);
				break;
			case "4":
				System.out.println("�������� Ȯ�� ");
				System.out.println("���� ��ȣ \t �Աݾ� \t ������");
				for (String key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();
				}
				break;
			case "5":
				System.out.println("���α׷� ���� ");
				System.exit(0);
			default:
				System.out.println("�Է� �� ���� ");
			}
		}
	}

}
