package package03;

import java.io.UnsupportedEncodingException;

public class Ex14Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCDE";
		byte bytes1[]=str.getBytes();
		System.out.println("bytes1.length : "+bytes1.length);
		str=new String(bytes1);
		System.out.println("bytes1->String :"+str);
		
		try {
			bytes1=str.getBytes("EUC-KR");
			System.out.println("EUC-KR "+bytes1.length+" 길이입니다");
			
			bytes1=str.getBytes("UTF-8");
			System.out.println("UTF-8 "+bytes1.length+" 길이입니다");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
