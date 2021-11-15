package multi_implement;

public class RemoteControlNoNameExample {
	//�͸� ���� : ��ӵ� Ŭ�������� ���� ���, Ŭ������ ������� �ʰ� ���
	//��ü ������ ���ÿ� ������
	public static void main(String [] args) {
		//�������̽��� �̿��ؼ� ��ü�����ÿ� �������ϴ� ��
		RemoteControl rc = new RemoteControl() {
			int volume;
	
			@Override
			public void turnOn() {
				System.out.println("tv�� �Ѵ�.");
				
			}
	
			@Override
			public void turnOff() {
				System.out.println("tv�� ����.");
			}
	
			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {//����� Ŭ������.�����
					this.volume = RemoteControl.MAX_VOLUME;
				}else if (volume < RemoteControl.MIN_VOLUME) {//����� Ŭ������.�����
					this.volume = RemoteControl.MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("���� TV ����: " + this.volume);
			}
		
		};
	}
}
