package package02;

public class Ex08Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex08 ex08= new Ex08();
		try {
			//예외가 발생하면 반복되지않는다.
			//
			ex08.gugu();	
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력하세요 ");
		}finally {
			System.out.println("다시 시작합니다.");
		}
		
	}

}
