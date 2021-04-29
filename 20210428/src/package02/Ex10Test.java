package package02;

import java.util.Scanner;

public class Ex10Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Ex10 ex=new Ex10();
		while(true)
		{
			try {
			ex.gugu();}
			catch(NumberFormatException e)
			{
				System.out.println("숫자만 넣어라 응기잇");
			}finally {
				System.out.println("다시 시작하려면 아무키나 누르세요,종료 하려면 exit를 누르세요");
				String stop=sc.nextLine();
				if(stop.equals("exit")) {
					System.out.println("시스템종료");
					sc.close();
					ex.sc.close();
					break;
				}
			}
			
		}
		
		
	}

}
