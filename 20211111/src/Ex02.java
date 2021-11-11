
public class Ex02 {
	final int first; //반드시 초기값이 존재해야한다. //final변수와 상수 이름은 모두 대문자로 약속함, 소문자로 해도 되긴 함
	final int second;
	String name;
	final String GOODS_PRICE;
	
	public Ex02(int first, int second, String GOODS_PRICE) { //생성자
		this.first = first;
		this.second = second;
		this.GOODS_PRICE = GOODS_PRICE;
	}
	/*setter를 이용해서 값을 변경할 수 없다.
	public void setFirst(int first) { 
		this.first = first;
	}
	*/
	public void setName(String name) { 
		this.name = name;
	}
	public String getName() { 
		return this.name ;
	}
	
	public int getFirst() { //getter로 값 전달은 가능하다
		return this.first;
	}
	public int getSecond() { 
		return this.second;
	}
}
