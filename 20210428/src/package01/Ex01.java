package package01;

import java.util.Scanner;

public class Ex01 {
	public static void main (String []args)
	{

		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("분자를 숫자로 입력하시오 : ");
		String data1=sc.nextLine();
		System.out.print("분모를 숫자로 입력하시오 : ");
		String data2=sc.nextLine();
	
		try {
			int num1=Integer.parseInt(data1);
			int num2=Integer.parseInt(data2);
			System.out.println(num1/num2);
		}catch(NumberFormatException e) {
			System.out.println("only number ");
			e.printStackTrace();
		}catch(ArithmeticException e1) {
			System.out.println("분모 0 ㄴㄴ");
			e1.printStackTrace();
		}
		
		}
		//NumberFormatException
	}
}
