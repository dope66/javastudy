package package02;

import java.util.ArrayList;

public class Ex09Test {

	public static void main(String[] args) {
		ArrayList <Integer> map = new ArrayList<Integer>();
		for (int i = 1; i <= 45; i++) {
			map.add(i);
		}
		int lotto[] = new int[6];// �ʿ��� 6���� ���� �����ϱ����� �迭
		for (int i = 0; i < lotto.length; i++) {
			//����Ʈ�� index�� ���� ������ ������ //45
			int num = (int) (Math.random() * map.size()) ;//0~44
			lotto[i] = map.get(num);//����Ʈ�� �ִ� ���� �迭�� ����
			map.remove(num);//�迭�� ����� ����Ʈ�� ���� ����
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
