package package03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex15Test {
	public static void main(String[] args) {
		List<Board> list=new ArrayList<Board>();
		Board b=new Board("title","content","name");
		list.add(new Board("for","the","king"));
		list.add(new Board("for2","the2","land2"));
		list.add(new Board("for3","the3","mountain3"));
		list.add(new Board("Emerald","Sword4","name4"));
		
		for(Board bd:list)
		{
			System.out.println(bd.content+" / "+bd.subject+" / "+bd.writter);
		}
		
		List<Board> list2 =new Vector<Board>();
		Board b1=new Board("s","s","1");
		list2.add(b1);
		list2.add(new Board("for","the","king"));
		list2.add(new Board("for2","the2","land2"));
		list2.add(new Board("for3","the3","mountain3"));
		list2.add(new Board("Emerald","Sword4","name4"));
		for(Board bb:list2)
		{
			System.out.println(bb.content+" / "+bb.subject+" / "+bb.writter);
		}
	}
}
//����Ʈ�� add(), ����Ʈ���ִ� ���� �����Ë� get(index)
//����Ʈ�� �ִ°� ���� remove(index) remove("��")
//����Ʈ�� ũ�� size();
// ����Ʈ�� �� ���� add(index,"��");
//����Ʈ ��ü ���鶧 ���Ǵ� class : ArrayList ,Arrays.asList Vector