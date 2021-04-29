package package03;

public class Ex12 {
	
	String id;
	public Ex12(String id)
	{
		this.id=id;
		
	}
	public void checked(Object obj) {
		if(obj instanceof Ex12)
		{
			System.out.println(this.id);
			
		}else
		{
			System.out.println(obj);
		}
		
	}
	
	
}
