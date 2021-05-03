package package02;

import java.util.ArrayList;

public class Ex09Test {

	public static void main(String[] args) {
		ArrayList <Integer> map = new ArrayList<Integer>();
		for (int i = 1; i <= 45; i++) {
			map.add(i);
		}
		int lotto[] = new int[6];// 맵에서 6개의 값을 저장하기위한 배열
		for (int i = 0; i < lotto.length; i++) {
			//리스트의 index를 랜덤 값으로 가져옴 //45
			int num = (int) (Math.random() * map.size()) ;//0~44
			lotto[i] = map.get(num);//리스트에 있는 값을 배열에 저장
			map.remove(num);//배열에 저장된 리스트의 값을 삭제
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
