package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex14Test {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board b = new Board("力格", "郴侩", "历磊");
		list.add(b);
		b = new Board("力格1", "郴侩1", "历磊1");
		list.add(b);
		b = new Board("力格2", "郴侩2", "历磊2");
		list.add(b);
		for (Board bd : list) {
			System.out.println(bd.content + " " + bd.subject + " " + bd.writter);
		}

		for (int idx = 0; idx < list.size(); idx++) {
			Board bd = list.get(idx);
			System.out.println(bd.content+","+bd.subject);
		}
		
		
		
		
		
	}

}
