package package01;

import java.util.Scanner;

public class Ex02 {
	/*
	 * Scanner sc=new Scanner(System.in); int i=10;
	 */
	String id;

	public Ex02(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// 사용하고있는 객체가 현클래스로 만들어 졌는가 ㅎ
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ex02) {
			Ex02 ex = (Ex02) obj;
			if (this.id.equals(ex.getId())) {

				return true;
			} else {
				System.out.println("다른 값이다");
				return false;
			}
		} else {
			return false;
		}
	}

}
