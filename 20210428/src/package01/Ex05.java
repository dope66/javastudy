package package01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("프로그램 종료하고 싶다면 press exit");
			System.out.println("분자를 입력하세요 : ");
			String data1 = sc.nextLine();
			System.out.println("분모를 입력하세요 : ");
			String data2 = sc.nextLine();
			System.out.println("배열 번호를 입력하시오 .");
			String data3 = sc.nextLine();
			int idx=Integer.parseInt(data3);
			if (data1.equals("exit") || data2.equals("exit")) {
				break;
			}
			int num[] = new int[2];
			try {
				num[0] = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[idx]);
			} catch (NumberFormatException e) {
				System.out.println("only number ");

			} catch (ArithmeticException e1) {
				System.out.println("분모 0 ㄴㄴ");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기는 1이어야합니다.");
			}finally {//try나 catch가 실행된후 무조건실행
				System.out.println("다시시작합니다");
				sc.next();
			}

		}

	}

}
