package casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //�ڵ��� ��ȯ, �θ� �ִ� �͸� ��� ����
		vehicle.run(); //�θ� �ڽ� ��ü�� �ִ� �� ��밡��
		
		Bus bus = (Bus)vehicle; //�θ� �ڽ����� ������ ��ȯ, �ڽ� ��ü�� �ִ� ���� ��� ����
		bus.checkFare();
		bus.run();
	}

}
