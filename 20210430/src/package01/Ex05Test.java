package package01;

public class Ex05Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 ex1=new Ex02("김현우");
		ex1.setId("김현진");
		Ex02 ex2=new Ex02("김현진");
		Ex02 ex3 =new Ex02("김현우");
		Ex04 ex4=new Ex04();
		
		if(ex1.equals(ex2)) {
			System.out.println("ex1과 ex2 는 같다.");
		}else {
			System.out.println("ex1과 ex2는 동일한 값이아니다");
		}
		if(ex1.equals(ex3)) {
			System.out.println("ex1과 ex3 는 같다.");
		}else {
			System.out.println("ex1과 ex3는 동일한 값이아니다");
		}
		if(ex1.equals(ex4)) {
			System.out.println("같은객채입니다");
		}else {
			System.out.println("같은객채가 아뉩뉘돠");
		}
		
		
		
		
		
		
		
		
		
	}

}
