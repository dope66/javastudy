package package03;

import java.util.List;
import java.util.ArrayList;

public class Ex12Test {

	public static void main(String[] args) {

		/////////�������� �ڷḦ�ϳ��� ����
		//�迭 : ���� �ڷ��� �����͸� ������ ũ�⸸ŭ ����
		//class : �ٸ� ������ �����͸� �����Ҽ� �ְ����ش�.
		//�÷��� : ũ�⸦ �����Ǿ��������� �ڷ��� (list map set)
		//		ũ�⸦ ���������� ����Ҽ� �ְ� ����� ���� 
		//list �� map�� ���̴� index(list)�� ����ϴ��� �Ǵ� key(map)�� ����ϴ��� 
		List<String>list=new ArrayList<String>();
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("����");
		list.add("������");
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
		list.remove("Database");//value�� �̿��ؼ� ����
		System.out.println(list.get(2));
		
		
		
		
		
		
		
		
		
	}

}
