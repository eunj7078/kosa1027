
public class Ex03 {
	int first;
	int second;
	static int val; //���� ����
	int val1;
	public int add(/* Ex03 this */) { //��� �޼��� 
		return val + this.first;
	}
	public static int sub() { //static �޼���
		//return val - val1; //static �޼��� �������� instance ������ ����� �� ����
		
		return val;
	}
}
