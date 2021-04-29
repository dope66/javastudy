package package02;

import java.util.Scanner;

public class Ex08 {
	public void gugu() throws NumberFormatException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("구구단 출력 ");
		while(true)
		{
			System.out.println("프로그램을 종료하려면 exit");
			
			System.out.print("첫단을 입력하십시오 : ");
			String data1=sc.nextLine();
			System.out.println("마지막 단을 입력하시오 : ");
			String data2=sc.nextLine();
			System.out.println("시작 곱을 입력하시오 : ");
			String data3=sc.nextLine();
			System.out.println("마지막 곱을 입력하세요 : ");
			String data4=sc.nextLine();
			
			if(data1.equals("exit")||data2.equals("exit")||data3.equals("exit")||data4.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
			int startDan=Integer.parseInt(data1);
			int endDan=Integer.parseInt(data2);
			int startGop=Integer.parseInt(data3);
			int endGop=Integer.parseInt(data4);
			
			/*for(startDan;startDan<=endDan;startDan++)
			{
				for(startGop;endGop;startGop+=1)
			}*/
			for(int dan=startDan;dan<=endDan;dan++)
			{
				for(int gop=startGop;gop<=endGop;gop++)
				{
					System.out.println(dan+"X"+gop+"="+dan*gop);
				}
			}
		}
	}
}
