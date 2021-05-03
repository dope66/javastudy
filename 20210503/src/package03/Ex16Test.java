package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex16Test {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김현우", 25);
		map.put("이현우", 24);
		map.put("최현우", 34);
		
		System.out.println("map size : "+map.size());
		System.out.println("data print : "+map.get("김현우"));
	map.remove("최현우");
		map.put("김현우", 33);//맵은 중복키를 허용치않음
	
		for(String str:map.keySet())
		{
			System.out.println(map.get(str));
		}
		map.clear();
		System.out.println("map size " + map.size());
		
		
		

	}
}
//map 데이터 저장 : put(key,value) 
//데이터를 수정 : put(key,value)키는 존재하는값이어야한다.
//키만 가져올때 : keySet();
//값을 가져올떄 : get(key);
//모든 데이터 삭제 : clear();
//특정값 삭제 : remove(key) remover(key, value)





