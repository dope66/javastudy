package package02;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com1 = (int) (Math.random() * 3) + 1;
		//Random rnd =new Random(3);
		//int com1=rnd.nextInt(3)+1;
		System.out.println("���������� ���� ���� ! ");
		System.out.println("���� : 1 ���� : 2 �� : 3 ");
		int human = sc.nextInt();
		switch (com1) {
		case 1:
			System.out.println("��ǻ�Ͱ� �����t �½��ϴ�.");
			switch (human) {
			case 1:
				System.out.println("You Draw");break;
			case 2:
				System.out.println("You Win");break;
			case 3:
				System.out.println("You Lose");break;
			}
			break;
		case 2:
			System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
			switch (human) {
			case 1:
				System.out.println("You Lose");
				break;
			case 2:
				System.out.println("You Draw");
				break;
			case 3:
				System.out.println("You Win");
				break;
			}
			break;
		case 3:
			System.out.println("��ǻ�Ͱ� ���� �½��ϴ�.");
			switch (human) {
			case 1:
				System.out.println("You Win");break;
			case 2:
				System.out.println("You Win");break;
			case 3:
				System.out.println("You Draw");break;
			}
			break;
		}

	}

}
