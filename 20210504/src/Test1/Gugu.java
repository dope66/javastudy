package Test1;

public class Gugu {
		
	
	public void gugu(int startdan,int enddan ,int startgop,int endgop) {
		
		for(int dan=startdan;dan<=enddan;dan++)
		{
			for(int gop=startgop;gop<=endgop;gop++)
			{
				System.out.println(dan+"x"+gop+"="+dan*gop);
			}
		}
		
	}
}
