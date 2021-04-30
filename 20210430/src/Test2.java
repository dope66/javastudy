import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Test1 test=new Test1();
	
		while(true)
		{
			try {
			test.gugu1();}catch(NumberFormatException e)
			{
				System.out.println("숫자만 입력하세요 !");
			}finally {
				System.out.println("프로그램을 종료하시려면 exit키 아니면 아무키나 눌러주세요" );
				String stop=sc.nextLine();
				if(stop.equals("exit")) {
					System.out.println("프로그램을 종료합니다.");
					 sc.close();
					 test.sc.close();
					 break;
				}
			}
		}
	}

}
