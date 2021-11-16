package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String>set = new HashSet<String>();
		set.add("이숭무"); //순서에 영향을 받지 않는다. = 파이썬의 set 자료형(집합)
		set.add("이상범");
		set.add("이충무");
		set.add("이길무");
		set.add("이길무"); //같은 값은 저장이 되지 않는다.
		int size = set.size();
		System.out.println(size);
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {//다음에 값이 있냐고 물어봄
			String s = (String)iterator.next();
			System.out.println(s);
		}
		set.remove("이숭무");
		size = set.size();
		System.out.println(size);
		
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
