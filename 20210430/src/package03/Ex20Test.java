package package03;

public class Ex20Test {

	public static void main(String[] args) {
		
		String url="https://news.naver.com/main/read.nhn";
		String contextPath="/main";
		
		int idx1=url.indexOf("/main");
		System.out.println(url.substring(idx1+5));
		//위 문자열에서 /read.nhn만 출력하세요 
		System.out.println(url.substring(url.indexOf(contextPath)+contextPath.length()));
		
		
	}

}
