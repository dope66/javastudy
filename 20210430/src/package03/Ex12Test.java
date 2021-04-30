package package03;

public class Ex12Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="김현우";
		String name1=new String ("김현우");
		String name2="김현우";
		
		if(name==name2)
		{
			System.out.println("주소가 같다.");
		}else
		{
			System.out.println("주소가 다르다.");
		}
		
		if(name==name1)
		{
			System.out.println("주소가 같다.");
		}else
		{
			System.out.println("주소가 다르다.");
		}
		Ex11Test ex=new Ex11Test();
		System.out.println(ex);
		
		if(name.equals(name2))
		{
			System.out.println("값이 같다");
		}else {
			System.out.println("값이 다르다.");
		}
		
		
	}

}
