package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		List list = new ArrayList(); //강제형변환
		//list.add(1);
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		for (int i = 0; i<list.size();i++) {
			Board s = (Board)list.get(i);
			System.out.println(s.getContent());
		}
		list.add(1, new Board("제목5", "내용5", "글쓴이5"));
		for (int i = 0; i<list.size();i++) {
			Board s = (Board)list.get(i);
			System.out.println(s.getContent());
		}
		//제너릭 타입 - 사용하면 강제형변환 안해도 됨
		List<Board> list1 = new ArrayList(); //타입을 적어주면 강제 형변환을 할 필요가 없다.
		list1.add(new Board("제목1", "내용1", "글쓴이1"));
		list1.add(new Board("제목2", "내용2", "글쓴이2"));
		list1.add(new Board("제목3", "내용3", "글쓴이3"));
		list1.add(new Board("제목4", "내용4", "글쓴이4"));
		for (int i = 0; i<list1.size();i++) {
			Board s = list1.get(i);
			System.out.println(s.getContent());
			System.out.println(list1.get(i).getContent());
		}
		
		
		
		
		
		
	}

}
