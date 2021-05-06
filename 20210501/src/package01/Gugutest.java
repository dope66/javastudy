package package01;

import java.util.Scanner;

public class Gugutest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gugu test = new Gugu();
		while(true) {
			try {
				test.gugu();
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요 ");
			} finally {
				System.out.println("프로그램을 종료하고싶으면 exit아니면 아무키나 누르세요 ");
				String stop = sc.nextLine();
				if (stop.equals("exit")) {
					System.out.println("프로그램 종료 ");
					sc.close();
					break;
				}

			}
		}
	

	}

}
