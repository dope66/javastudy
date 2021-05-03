package package01;

import java.util.Scanner;

public class Ex01 {

		Scanner sc=new Scanner(System.in);
		public void gugu(int startdan ,int enddan,int startgop ,int endgop)
		{
			for(int dan=startdan;dan<=enddan;dan++)
			{
				for(int gop=startgop;gop<=endgop;gop++)
				{
					System.out.println(dan+"x"+gop+"="+dan*gop);
				}
			}
		}
}
