package Test1;

import java.util.Scanner;

public class GuguTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Gugu gugu=new Gugu();
		System.out.print("ù���� �Է��ϼ��� ");
		String data1=sc.nextLine();
		System.out.print("������ �Է��ϼ��� ");
		String data2=sc.nextLine();
		System.out.print("ù���� �Է��ϼ��� ");
		String data3=sc.nextLine();
		System.out.print("������ �Է��ϼ��� ");
		String data4=sc.nextLine();
		
		Integer startdan=Integer.parseInt(data1);
		Integer enddan=Integer.parseInt(data2);
		Integer startgop=Integer.parseInt(data3);
		Integer endgop=Integer.parseInt(data4);
		
		gugu.gugu(startdan, enddan, startgop, endgop);
	}

}
