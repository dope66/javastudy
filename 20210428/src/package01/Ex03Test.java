package package01;

public class Ex03Test {
	static Ex03 ex;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	
		ex.num1=10;
		ex.num2=20;
	
		}catch(NullPointerException e) {
			ex=new Ex03();//객체가 생성되지않았을때 nullpoint; 
			ex.num1=10;
			ex.num2=20;
		}
		ex.add();
	}

}
