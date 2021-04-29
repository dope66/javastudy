package package02;

import java.util.Scanner;

public class Ex09Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex09 ex = new Ex09();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				ex.gugu();
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력할수 있습니다.");
			}finally {
				System.out.println("종료 하려면 exit ,계속하려면 아무키나  ");
				 String stop=sc.nextLine();
				 if(stop.equals("exit")) {
					 System.out.println("프로그램을 종료합니다.");
					 ex.sc.close();
					 break;
					 
				 }
			}
		}

	}

}
