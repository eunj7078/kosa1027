
public class Ex02 {
	final int first; //�ݵ�� �ʱⰪ�� �����ؾ��Ѵ�. //final������ ��� �̸��� ��� �빮�ڷ� �����, �ҹ��ڷ� �ص� �Ǳ� ��
	final int second;
	String name;
	final String GOODS_PRICE;
	
	public Ex02(int first, int second, String GOODS_PRICE) { //������
		this.first = first;
		this.second = second;
		this.GOODS_PRICE = GOODS_PRICE;
	}
	/*setter�� �̿��ؼ� ���� ������ �� ����.
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
	
	public int getFirst() { //getter�� �� ������ �����ϴ�
		return this.first;
	}
	public int getSecond() { 
		return this.second;
	}
}
