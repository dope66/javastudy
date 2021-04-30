package package02;

import java.util.Scanner;

public class Ex09Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("프로그램을 종료하려면 exit");
			System.out.println("구구단 프로그램 실행");
			System.out.print("첫번째 단을 입력하세요 : ");
			String data1 = sc.nextLine();
			System.out.print("마지막 단을 입력하세요 : ");
			String data2 = sc.nextLine();
			if(data1.equals("exit")||data2.equals("exit"))
			{	
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
				//System.exit(0);//프로글매을 아예 종료 시킬때씀
				
			}
			/*
			 * System.out.print("첫번째 곱을 입력하세요 : "); String data3=sc.nextLine();
			 * System.out.print("마지막 곱을 입력하세요 : "); String data4=sc.nextLine();
			 */
			int startdan = Integer.parseInt(data1);
			int enddan = Integer.parseInt(data2);

			for (int dan = startdan; dan <= enddan; dan++) {
				for (int gop = 1; gop < 10; gop++) {
					System.out.println(dan + "x" + gop + "=" + dan * gop);
				}
			}
		}
		System.out.println("프로그램 종료 ");
		
	}

}
