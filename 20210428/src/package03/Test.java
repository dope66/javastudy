package package03;

import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);

	public void gugu() {
		System.out.println("구구단을 실행합니다.");
		System.out.print("시작할 단을 입력하세요.	>");
		String data1 = sc.nextLine();
		System.out.print("마지막 단을 입력하세요.	>");
		String data2 = sc.nextLine();
		System.out.print("시작할 곱을 입력하세요.	>");
		String data3 = sc.nextLine();
		System.out.print("마지막 곱을 입력하세요.	>");
		String data4 = sc.nextLine();
		
		int startdan = Integer.parseInt(data1);
		int enddan = Integer.parseInt(data2);
		int startgop = Integer.parseInt(data3);
		int endgop = Integer.parseInt(data4);

		for (int dan = startdan; dan <= enddan; dan++) {
			for (int gop = startgop; gop <= endgop; gop++) {
				System.out.println(dan + "x" + gop + "=" + dan * gop);
			}
		}

	}

}
