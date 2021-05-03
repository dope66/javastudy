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
//리스트에 add(), 리스트에있는 값을 가져올떄 get(index)
//리스트에 있는값 삭제 remove(index) remove("값")
//리스트의 크기 size();
// 리스트에 값 삽입 add(index,"값");
//리스트 객체 만들때 사용되는 class : ArrayList ,Arrays.asList Vector