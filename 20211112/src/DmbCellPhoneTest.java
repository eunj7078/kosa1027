
public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone ex = new DmbCellPhone("�ڱ���", "����", 5);
		
		//�θ�κ��� ��ӹ��� �޼ҵ� ���
		ex.powerOn();
		ex.bell();
		ex.sendVoice("��������");
		ex.receiveVoice("�̼��� �� �³���");
		ex.sendVoice("�ȳ��ϼ���");
		ex.hangup();
		
		//�ڽ� Ŭ�����޼��� ����
		ex.turnOnDmb();
		ex.changeChannelDmb(22);
		ex.turnOffDmb();
		
	}

}
