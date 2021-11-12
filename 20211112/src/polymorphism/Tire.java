package polymorphism;

public class Tire {
	public int maxRotation; //0
	public int accumulatedRotation; //���� ȸ������ �ʱⰪ�� �ʿ����� �ʴ�.
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() { //Ÿ�̾ �������� �޼���
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + " Tire ��ũ ***");
			return false;
		}
	}
	
	
	
	
	
	
}
