package package01;

import java.util.Scanner;

public class Ex02Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex01 ex = new Ex01();
		/*
		 * int dan1=2; int dan2=5; int gop1 =1; int gop2 =9; ex.gugu(dan1, dan2, gop1,
		 * gop2);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���۴��� �Է��ϼ��� :");
		int dan1 = sc.nextInt();
		System.out.print("������ �Է��ϼ��� :");
		int dan2 = sc.nextInt();
		System.out.print("���۰��� �Է��ϼ��� :");
		int gop1 = sc.nextInt();
		System.out.print("������ �Է��ϼ��� :");
		int gop2 = sc.nextInt();
		
		ex.gugu(dan1, dan2, gop1, gop2);
		
		
		
		
		
	}

}
