
public class Ex10 {
	String company;
	String model;
	String color;
	int maxSpeed;
	public Ex10(String company, String model, int maxSpeed) {
		//�����ڿ��� �ٸ� ������ ����
		this(company,model);
		/*
		this.company = company;
		this.model = model;
		*/
		this.maxSpeed = maxSpeed;
	}
	
	public Ex10(String company, String model, String color) {
		this(company, model); //this() �޼���� ������ ȣ��
		/*
		this.company = company;
		this.model = model;
		*/
		this.color = color;
	}
	//this�� ����ʵ��̴�.
	//this()�޼��带 ���Ǵ� �����ڴ� �Ʒ��� ������ִ� ���� ����.
	public Ex10(String company, String model) {
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