package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex16Test {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("������", 25);
		map.put("������", 24);
		map.put("������", 34);
		
		System.out.println("map size : "+map.size());
		System.out.println("data print : "+map.get("������"));
	map.remove("������");
		map.put("������", 33);//���� �ߺ�Ű�� ���ġ����
	
		for(String str:map.keySet())
		{
			System.out.println(map.get(str));
		}
		map.clear();
		System.out.println("map size " + map.size());
		
		
		

	}
}
//map ������ ���� : put(key,value) 
//�����͸� ���� : put(key,value)Ű�� �����ϴ°��̾���Ѵ�.
//Ű�� �����ö� : keySet();
//���� �����Ë� : get(key);
//��� ������ ���� : clear();
//Ư���� ���� : remove(key) remover(key, value)





