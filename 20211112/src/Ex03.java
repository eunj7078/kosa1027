
public class Ex03 extends Ex02{ //�ڽ� Ŭ����
	String subject;
	public Ex03(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	}
	@Override
	public double area() { //�θ�κ��� ��ӹ��� �ָ� ������ 
		return radius * radius * Math.PI;
	}
	public double area(double p) { //�����ε�
		return radius * radius * p; 
	}
	public double area1() { //�θ� Ŭ������ ���� ����ϰڴ�.
		return super.area();
	}
}
