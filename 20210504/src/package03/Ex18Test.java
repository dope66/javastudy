package package03;

import java.util.HashMap;
import java.util.Map;
public class Ex18Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "������");
		map.put(2, "������");
		map.put(3,"������");
		map.put(4, "������");
		map.remove(3);
		System.out.println(map.keySet());
		
		for(Integer i:map.keySet()) {
			System.out.println(map.get(i));
		}
	}
}
