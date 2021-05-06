import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01Tset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Account> map = new HashMap<String, Account>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("계좌등록: 1\t|입금 : 2 \t|출금 : 3 \t|계좌출력 : 4 \t|종료 : 5");
			System.out.print("번호를 선택하세요 > ");
			String num = sc.nextLine();//num을 String 으로 하면 넘어가지고 아니면sc.nextline으로해야된다 
			switch (num) {
			case "1":
				System.out.println("계좌등록 화면");
				System.out.print("계좌 번호를 등록하세요 > ");
				String accnum = sc.nextLine();
				System.out.print("초기 입금 금액을 넣으세요 > ");
				Integer money = sc.nextInt(); sc.nextLine();
				System.out.print("계좌 주인 이름 입렵 > ");
				String name = sc.nextLine();
				Account acc = new Account(accnum, money, name);
				map.put(accnum, acc);
				break;
			case "2":
				System.out.println("입금화면 ");
				System.out.print("입금할 계좌를 입력해주세요  >");
				accnum = sc.nextLine();
				System.out.print("입금 금액을 입력해주세요 > ");
				money = sc.nextInt();
				sc.nextLine();
				acc = map.get(accnum);
				acc.setDeposit(money);
				break;
			case "3":
				System.out.println("출금화면 ");
				System.out.println("출금 계좌를 입력해주세요 > ");
				accnum = sc.nextLine();/* enter값을 가져감 */
				System.out.println("출금 금액을 입력해주세요 > ");
				money = sc.nextInt();
				sc.nextLine();
				acc = map.get(accnum);
				acc.setWithdraw(money);
				break;
			case "4":
				System.out.println("계좌정보 확인 ");
				System.out.println("계좌 번호 \t 입금액 \t 계좌주");
				for (String key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();
				}
				break;
			case "5":
				System.out.println("프로그램 종료 ");
				System.exit(0);
			default:
				System.out.println("입력 값 오류 ");
			}
		}
	}

}
