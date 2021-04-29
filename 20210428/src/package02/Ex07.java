package package02;

import java.util.Scanner;

public class Ex07 {
	public void div() throws ArrayIndexOutOfBoundsException,NumberFormatException,ArithmeticException{
		Scanner sc=new Scanner(System.in);
		System.out.println("나눗셈 프로그램을 시작합니다.");
		while(true) {
		System.out.println("프로램을 종료하려면 exit 눌러라");
		System.out.println("분자값을 입력 하시오 : ");
		String data1=sc.nextLine();
		System.out.println("분모값을 입력 하시요 : ");
		String data2=sc.nextLine();
		
		System.out.println("idx 값을 입력하시오 : ");
		String data3=sc.nextLine();
		if(data1.equals("exit")||data2.equals("exit")||data3.equals("exit")) {
			System.out.println("프로그램을 종료합니다");
			sc.close();
			break;
		}
		int idx=Integer.parseInt(data3);
		
		int num[]=new int[2];
		num[0]=Integer.parseInt(data1);
		num[idx]=Integer.parseInt(data2);
		System.out.println(num[0] / num[idx]);
		}
		
	}
}
