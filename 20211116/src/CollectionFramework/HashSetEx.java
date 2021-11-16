package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동", 30)); //Member
		set.add(new Member("이숭무", 50)); //Member
		System.out.println(set.size());
		//리스트처럼 값을 받아오는 것이 불가능
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member m = iterator.next();
			System.out.println(m.getName());
			if(m.getName().equals("이숭무")) {
				set.remove(m);
				break;
			}
		}
		System.out.println(set.size());
		
		for(Member m : set) {
			if(m.getName().equals("홍길동")) {
				set.remove(m);
				break;
			}	
		}
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set.isEmpty());

	}

}
