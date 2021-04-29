package package01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("프로그램을 종료하려면 exit를 적으세요 ");
			System.out.println("분자를 숫자로 입력하시오 ");
			String data1 = sc.nextLine();
			System.out.println("분모를 숫자로 입력하세요 ");
			String data2 = sc.nextLine();
			System.out.println("배열 숫자를 입력하시요");
			String data3 = sc.nextLine();

			int num[] = new int[2];
			Exception ex=new ArithmeticException();
			// num[2]=Integer.parseInt(data3);
			try {
				num[0] = Integer.parseInt(data1);// parsing
				num[1] = Integer.parseInt(data2);
				System.out.println(num[0] / num[1]);
			} 
			catch(NumberFormatException e) {
				System.out.println("only number ");
				
			}catch(ArithmeticException e1) {
				System.out.println("분모 0 ㄴㄴ");
			
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기는 1이어야합니다.");
			}
			/*catch (Exception e) {
				System.out.println("분모가 0이면 안됩니다.");
				e.printStackTrace();
			} */

			
			
			
			
			
		}

	}

}
