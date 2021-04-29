package package02;

import java.util.Scanner;

public class Ex09 {
	Scanner sc = new Scanner(System.in);

	public void gugu() throws NumberFormatException {

		System.out.println("프로그램을 종료하려면 exit");
		System.out.print("첫단을 입력하십시오 : ");
		String data1 = sc.nextLine();

		System.out.println("마지막 단을 입력하시오 : ");
		String data2 = sc.nextLine();
		System.out.println("시작 곱을 입력하시오 : ");
		String data3 = sc.nextLine();
		System.out.println("마지막 곱을 입력하세요 : ");
		String data4 = sc.nextLine();

		int startDan = Integer.parseInt(data1);
		int endDan = Integer.parseInt(data2);
		int startGop = Integer.parseInt(data3);
		int endGop = Integer.parseInt(data4);

		for (int dan = startDan; dan <= endDan; dan++) {
			for (int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + "X" + gop + "=" + dan * gop);
			}
		}

	}
}
