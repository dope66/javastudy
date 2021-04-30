package package03;

public class Ex16Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		String ssn="930628-1234567";
		//			0123456789
		System.out.println(ssn.substring(0, 8)+"******");
		int idx=ssn.indexOf("-");
		System.out.println(idx);
		System.out.println(ssn.substring(0,idx));
		
		System.out.println(ssn.substring(idx+1));
		
		System.out.println(ssn.substring(idx-4,idx));
		System.out.println(ssn.substring(2,2+4));
		
		String str="qwertyuiopasdfghjkl";
		System.out.println(str.substring(2,5));
		
		int idx1=str.indexOf("i");
		System.out.println(str.substring(idx1,idx1+4));
		String str2="java programming";
		String str3="JAVA Programming";
		System.out.println(str2.equals(str3));
		String loweStr2=str2.toLowerCase();
		String loweStr3=str3.toLowerCase();
		System.out.println(loweStr2);
		System.out.println(loweStr3);
		System.out.println(loweStr2.equals(loweStr3));
		
		String upperStr1=str2.toUpperCase();
		String upperStr2=str3.toUpperCase();
		System.out.println(upperStr1);
		System.out.println(upperStr2);
		
		
		String str4=" 이숭무";
		if(str4.trim().equals("이숭무"))
		{
			System.out.println("같다");
		}else
		{
			System.out.println("다르다");
		}
		
		str4=" 이 숭무";//가운데 공백문자는 제거대상이 아니다. 
		if(str4.trim().equals("이 숭무"))
		{
			System.out.println("같다");
		}else
		{
			System.out.println("다르다");
		}
		
		int i=10;
		double d=10.5;
		boolean b=true;
		String i1="10";
		int res=Integer.parseInt(i1);
		
		String result=String.valueOf(i);
		result=String.valueOf(d);
		System.out.println(result);
		result=String.valueOf(b);
		System.out.println(result);
	}

}
