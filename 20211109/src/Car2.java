
public class Car2 {
	String model;
	String color;
	int maxSpeed;
	public Car2(String model) {
		this(model, "���", 250);
		/*
		this.model = model;
		this.color = "���";
		this.maxSpeed = 250;
		*/
	}
	public Car2(String model, String color) {
		this(model, color, 230);
		/*
		this.model = model;
		this.color = color;
		this.maxSpeed = 230;
		*/
	}
	
	public Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
