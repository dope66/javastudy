package Test;

import java.util.Scanner;

public class Gugutest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Gugu gugu=new Gugu();
			System.out.print("첫번째 단을 입력하세요 : ");
			String data1=sc.nextLine();
			System.out.print("마지막 단을 입력하세요 : ");
			String data2=sc.nextLine();
			System.out.print("첫번째 곱을 입력하세요 : ");
			String data3=sc.nextLine();
			System.out.print("마지막 곱을 입력하세요 : ");
			String data4=sc.nextLine();
			
			
			Integer startdan=Integer.parseInt(data1);
			Integer enddan=Integer.parseInt(data2);
			Integer startgop=Integer.parseInt(data3);
			Integer endgop=Integer.parseInt(data4);
			
			gugu.gugu(startdan, enddan, startgop, endgop);
			
		
	}
}
