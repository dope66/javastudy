package package03;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);		
		Test test=new Test();
		while(true) {
	try {
				test.gugu();}catch(NumberFormatException e) {
					System.out.println("숫자만 입력하세요 ");
				}finally {
					System.out.println("프로그램을 종료하려면 exit 아니면 아무키나 누르세요");
					String stop=sc.nextLine();
					if(stop.equals("exit")){
						System.out.println("프로그램을 종료합니다.");
						 sc.close();
						 test.sc.close();
						 break;
					}
					
					
					
				}
		
			
			
			
		}
	}

}
