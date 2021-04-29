package package02;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=10;
		Object obj1="김현우";
		Object obj2=10.5;
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		Object ex=new Ex10();
		Ex10 ex10=(Ex10)ex;
		ex10.gugu();
		
		
	}

}
