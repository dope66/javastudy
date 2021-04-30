package package02;

public class Ex08Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex06 ex1 = new Ex06("샘송", "개늑시");
		Ex06 ex2 = new Ex06("샘송", "ms");
		Ex07 ex3 = new Ex07();
		ex1.equals(ex2);
		if (ex1.equals(ex2)) {
			System.out.println("같은 객채입니다.");
		} else {
			System.out.println("다른 객채입니다.");
		}
		if (ex1.equals(ex3)) {
			System.out.println("같은 객채입니다.");
		} else {
			System.out.println("다른 객채입니다.");
		}
		String str=ex1.toString();
		System.out.println(str);
		String str1=ex2.toString();
		System.out.println(str1);
	}

}
