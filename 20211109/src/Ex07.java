
public class Ex07 {
	int first;
	int second;
	int result;
	
	//������ ������
	//�����ڰ� �����ڸ� ����� ����Ʈ �����ڴ� �ڵ����� ��������� �ʴ´�.
	//�����ڰ� �ִ� ��� ������ �����ڴ� ��������� ����� ��� �Ѵ�.
	public Ex07() {	
		System.out.println("����Ʈ ������ ����");
	}
	public Ex07(int first, int second) {
		this.first = first;
		this.second = second;
	}
	// setter
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	// getter
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void add() {
		this.result = this.first + this.second;
	}
	public void sub() {
		this.result = this.first - this.second;
	}
}
