package abstract_class;

public abstract class Phone { //�θ� Ŭ���� : �߻� Ŭ���� = �߻� �޼ҵ带 ������ �ִ� Ŭ����
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public abstract void turnOn();		// �߻�ȭ = ���ǵǾ����� ���� �޼���
	public abstract void turnOff();		// �߻�ȭ
}
