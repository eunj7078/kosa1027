
public class Ex11 {
	String company;
	String model;
	String color;
	int maxSpeed;
	public Ex11(String company, String model, int maxSpeed) {
		this(company, model);
		/*
		this.company = company; //�����ڵ�
		this.model = model; //�����ڵ�
		*/
		this.maxSpeed = maxSpeed;
	}
	
	public Ex11(String company, String model, String color) {
		this(company, model);
		/*
		this.company = company; //�����ڵ�
		this.model = model; //�����ڵ�
		*/
		this.color = color;
	}
	
	//�����ڵ带 �����ϴ� ������	
	public Ex11(String company, String model) {
		this.company = company;
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
