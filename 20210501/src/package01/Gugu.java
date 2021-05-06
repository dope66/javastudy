package package01;

import java.util.Scanner;

public class Gugu {
	Scanner sc=new Scanner(System.in);
	public void gugu() {
		System.out.println("구구단 프로그램 실행");
		System.out.println("첫번째 단을 입력하세요 : ");
		String data1=sc.nextLine();
		System.out.println("마지막 단을 입력하세요 : ");
		String data2=sc.nextLine();
		System.out.println("첫번째 곱을 입력하세요 : ");
		String data3=sc.nextLine();
		System.out.println("마지막 곱을 입력하세요 : ");
		String data4=sc.nextLine();
		
		int startdan=Integer.parseInt(data1);
		int enddan=Integer.parseInt(data2);
		int startgop=Integer.parseInt(data3);
		int endgop=Integer.parseInt(data4);
		
		for(int dan=startdan;dan<=enddan;dan++)
		{
			for(int gop=startgop;gop<=endgop;gop++)
			{
				System.out.println(dan+"x"+gop+"="+dan*gop);
			}
		}
		
	}
	
	
}
