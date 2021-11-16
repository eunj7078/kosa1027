package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
	//자바의 리스트는 배열의 단점(크기 고정)을 보완해서 만듦
		String str [] = {"나는", "자바", "너무", "좋아요"};
		System.out.println(str.length); //배열은 크기가 고정
		str[3] = "참좋아요";
		//str[4] = ".";
		//리스트는 크기가 유동적이다. 배열과 똑같이 같은 타입만 저장함
		List list = new ArrayList(); //파이썬의 리스트와 비슷, 한가지 자료형만 가질 수 있다.
		list.add("이숭무");
		list.add("이상범");
		list.add(1);
		System.out.println(list.get(0)); 
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		for(int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));			
		}
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		List<String> list1 = new ArrayList<String>();
		list1.add("이숭무");
		list1.add("이상범");
		list1.add("이장범");
		for(String s : list1) {
			System.out.println(s);	
		}
		
		int i = 10; 
		Object obj1 = 10; //자료형을 구분하지 않고 다 사용이 가능
		System.out.println(obj1);
		String st = "이숭무";
		obj1 = "이숭무";
		System.out.println(obj1);
		double d = 10.5;
		obj1 = 10.5;
		System.out.println(obj1);
		
		obj1 = new Calu();
		Calu calu = (Calu)obj1; //사용할 때는 강제 형변환
		calu.setFirst(10);
		System.out.println(calu.getFirst());
	}
}
