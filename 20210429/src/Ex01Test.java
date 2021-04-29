import java.util.HashMap;

public class Ex01Test {
	public static void main(String[] args) {
		HashMap<String, Ex01> map = new HashMap<String, Ex01>();
		Ex01 ex = new Ex01("2011", "naver.com", "kim");
		map.put(ex.userId, ex);
		ex = new Ex01("2012", "nate.com", "hyun");
		map.put(ex.userId, ex);
		ex = new Ex01("2013", "google.com", "woo");
		map.put(ex.userId, ex);
		ex = new Ex01("2014", "daum.com", "KHW");
		map.put(ex.userId, ex);
		for (String key : map.keySet()) {
			Ex01 ex01 = map.get(key);
			System.out.println(ex01.getUserId() + " / " + ex01.getUserEmail() + " / " + ex01.getUserName());
		}
	}
}
