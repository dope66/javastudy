package package01;

public class Ex04 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		Class.forName("java.util.Scanner");
		System.out.println("java.util.Scanner 클래스가 존재합니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지않습니다.");
		}
		try {
			Class.forName("package01.Ex03");
			System.out.println("package01.Ex03 클래스가 존재합니다.");
			}catch(ClassNotFoundException e) {
				System.out.println("클래스가 존재하지않습니다.");
			}
		try {
			Class.forName("package01.Ex");
			System.out.println("package01.Ex클래스가 존재합니다.");
			}catch(ClassNotFoundException e) {
				System.out.println("클래스가 존재하지않습니다.");
			}
		
		
		
	}

}
