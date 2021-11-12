package abstract_class;

//�߻� Ŭ������ ����ؼ� ����ϰ�, �߻�޼��带 �������ؼ� ����ؾ� �Ѵ�.
public class SmartPhone extends Phone{
	//�ڽ� Ŭ���������� abstract�� ����� �� ����
	//�߻� Ŭ������ ����� ������ �߻� �޼��带 �������Ͽ� ����Ѵ�.

	public SmartPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
		
	} 
	
	
}
