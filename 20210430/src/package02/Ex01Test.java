package package02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("1", "김현우");
		map.put("2", "이현우");
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		List<String> list = new ArrayList<String>();
		list.add("김현우");
		list.add("이현우");
		for (String val : list) {
			System.out.println(val);
		}

	}

}
