package package02;

public class Ex10Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starTime=System.currentTimeMillis();
		
		int sum=0;
		for (int i=1;i<=1000000;i++)
		{
			sum+=i;
		}
		System.out.println("1~1000000까지의 합 : "+sum);
		
		long endTime=System.nanoTime();
		System.out.println("실행시간은 "+(endTime-starTime)+"나노초걸렷습니다");
		
		endTime=System.currentTimeMillis();
		System.out.println("실행시간은 "+(endTime-starTime)+"/1000나노초 걸렸습니다.");
		
		
	}

}
