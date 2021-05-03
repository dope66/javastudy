package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex17Test {

	public static void main(String[] args) {

		Map<Integer, Board> map=new HashMap<Integer, Board>();
		Board b=new Board("title","contetnt","writer");
		map.put(1, b);
		map.put(2, new Board("title1","contetnt1","writer1"));
		map.put(3, new Board("title2","contetnt2","writer2"));
		System.out.println(map.size());
		for(Integer i:map.keySet())
		{
			System.out.println(map.get(i).content+" "+map.get(i).subject+" "+map.get(i).writter);
		}
		Map<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1, "김현우");
		map1.put(2, "이현우");
		map1.put(3, "박현우");
		for(Integer i:map1.keySet()) {
			String str1=map1.get(i);
			System.out.println(str1);
		}
		
	}

}
