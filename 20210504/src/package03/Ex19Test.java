package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex19Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "������");
		map.put(2, "������");
		map.put(3, "������");
		
		for(Integer i:map.keySet()) {
			String str=map.get(i);
			System.out.println(str);
		}	
		map.remove(2);
		for(Integer i:map.keySet()) {
			String str=map.get(i);
			System.out.println(str);
		}	
		map.clear();
		System.out.println("map size : "+map.size());
		
		
		
		
		
		

	}

}
