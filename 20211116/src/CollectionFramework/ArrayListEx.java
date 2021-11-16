package CollectionFramework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		Date date;
		List list = new ArrayList();
		list.add("이숭무"); //object
		list.add("이상범");
		list.add("이장범");
		list.add("이장범"); //리스트에서는 같은 값이 저장이 된다.
		list.set(3, "이길무");//리스트에 있는 값 수정
		for(int i = 0;i<list.size();i++) {
			String s = (String)list.get(i); //String으로 변환해서 출력
			System.out.println(s);
		}
		//Object으로 저장된 경우 아래처럼 사용하지 않는다.
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		//형변환을 하지 않음
		for(int i = 0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		//리스트에 있는 값을 삭제
		list1.remove(0);
		System.out.println(list1.size());
		System.out.println("===========================");
		System.out.println(list.size());
		for(Object obj : list) {
			String s  = (String)obj;
			System.out.println(s);
		}
		list.remove(0);
		System.out.println(list.size());
		list.remove("이상범");
		System.out.println(list.size());
		list.clear(); //removeAll 대신에 이걸 쓰는 것이 훨씬 낫다
		//list.removeAll(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());//비어있으면 true
		list.add("이숭무");
		System.out.println(list.isEmpty());//비어있으면 true
		//add, remove, size, isEmpty, removeAll
	}

}
