
public class Ex07Test {

	public static void main(String[] args) {
		//Ex07 ex07 = new ������
		Ex07 ex07 = new Ex07(20, 10); //���ڰ��� �ʿ��� -=> �Ű����� �ִ� ������
		ex07.add();
		System.out.println(ex07.getResult());

		Ex07 ex071 = new Ex07(); //�Ű������� ���� ������ = ����Ʈ ������
		ex07.setFirst(100);
		ex07.setSecond(50);
		
		Ex071 ex007 = new Ex071(); //����Ʈ ������
		ex007.setFirst(30);
		System.out.println(ex007.getFirst());
	}

}
