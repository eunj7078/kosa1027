package casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //자동형 변환, 부모에 있는 것만 사용 가능
		vehicle.run(); //부모가 자식 객체에 있는 걸 사용가능
		
		Bus bus = (Bus)vehicle; //부모가 자식으로 강제형 변환, 자식 객체에 있는 것이 사용 가능
		bus.checkFare();
		bus.run();
	}

}
