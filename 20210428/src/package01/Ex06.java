package package01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("나눗셈 프로그램을 실행합니다.");
		System.out.println("프로그램을 종료하려면 exit 눌러라");
		while (true) {
			System.out.print("분자를 입력하세요 : ");
			String data1 = sc.nextLine();
			System.out.print("분모를 입력하세요 : ");
			String data2 = sc.nextLine();

			System.out.print("insert to index number ");
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3);
			int num[] = new int[2];
			
			try {
				num[0] = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[idx]);
				
			} catch (ArithmeticException e) {
				System.out.println("분모 0 멈춰 !");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("idx는 1이상 !");
			}catch(NumberFormatException e)
			{
				System.out.println("문자 멈춰 !");
			}finally {
				System.out.println("다시 시작합뉘돠 훠훠훠");
			}

		}
	}

}
