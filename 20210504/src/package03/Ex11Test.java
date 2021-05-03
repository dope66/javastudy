package package03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11Test {

	public static void main(String[] args) {

		Date now = new Date();

		System.out.println(now);
		String strNow=now.toString();
		System.out.println(strNow);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String strNow2=sdf.format(now);
		System.out.println(strNow2);
		sdf= new SimpleDateFormat("yyyy-MM-dd hh 시 mm 분 ss 초");
		strNow2=sdf.format(now);
		System.out.println(strNow2);
		sdf= new SimpleDateFormat("yyyy 년 MM 월 dd 일 W주 hh 시 mm 분 ss 초 SS");
		strNow2=sdf.format(now);
		System.out.println(strNow2);
		
		
		
	}

}
