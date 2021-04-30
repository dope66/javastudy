package package03;

public class Ex13Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject="자바 프로그래밍";
		char ch= subject.charAt(3);
		System.out.println(ch);
		
		
		int idx=subject.indexOf("프");
	System.out.println(idx);
		
		
		idx=subject.indexOf("그래밍");
		System.out.println(idx);
		
		idx=subject.indexOf("이승무");
		System.out.println(idx);
		if(subject.indexOf("이찬진")!=-1)
		{
			System.out.println("이찬진이 있다");
		}else
		{
			System.out.println("이찬진이 없다.");
		}
		int count =subject.length();//문자열의 길이
		System.out.println(count);
		int i[]=new int[3];
		count=i.length;//배열의크기 
		System.out.println(count);
		System.out.println("이승무".length());
	}


}
