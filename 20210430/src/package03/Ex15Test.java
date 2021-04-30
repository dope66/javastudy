package package03;

public class Ex15Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String oldStr="나는 python이 좋다.";
		String newStr=oldStr.replace("python이",	"자바가");
		System.out.println(newStr);
		System.out.println(oldStr);
		
		oldStr=oldStr.replace("python이",	"자바가");
		System.out.println(oldStr);
	}

}
