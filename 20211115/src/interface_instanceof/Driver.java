package interface_instanceof;

public class Driver {
	public void driver(Vehicle vehicle) {
		//instanceof�� Ŭ������ ��ü�� ������ ���� �� ���
		if(vehicle instanceof Bus) { //instanceof: ��ü�� ���� �� ���
			//vehicle ��ü�� BusŬ������ ������� ��ü�Դϱ�?
			//instanceof�� ������� boolean�̴�.
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
