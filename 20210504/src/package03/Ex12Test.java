package package03;

import java.util.List;
import java.util.ArrayList;

public class Ex12Test {

	public static void main(String[] args) {

		/////////변수단점 자료를하나만 저장
		//배열 : 같은 자료형 데이터를 지정된 크기만큼 저장
		//class : 다른 유형의 데이터를 저장할수 있게해준다.
		//컬렉션 : 크기를 지정되어있지않은 자료형 (list map set)
		//		크기를 유동적으로 사용할수 있게 만들어 놓음 
		//list 와 map의 차이는 index(list)를 사용하는지 또는 key(map)를 사용하는지 
		List<String>list=new ArrayList<String>();
		list.add("김현우");
		list.add("김현우");
		list.add("김현우");
		list.add("윽윽");
		list.add("김현우");
		for(String s:list) {
			System.out.println(s);	
		}
		System.out.println(list.size());
		
		String str=list.get(2);
		System.out.println(str);
		str=list.get(3);
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list.size());
		System.out.println(str);
		
		list.add(2,"Database");
		str=list.get(2);
		System.out.println(str);
		list.remove("Database");//value를 이용해서 삭제
		System.out.println(list.get(2));
		
		
		
		
		
		
		
		
		
	}

}
