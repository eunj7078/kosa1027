package WrapperExample;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		int i = 10;
		String s = "10";
		
		Integer i1 = 10; //���� Ŭ���� //���� �ڷ��� (=int)
		i1 = Integer.parseInt(s); //���ڿ� ���� ���ڷ� ����
		
		byte by = 10;
		Byte by1 = 10;
		
		short sh = 10; //�Ϲ� �ڷ���
		Short sh1 = 10;
		
		double d = 10.5;
		Double d1 = 10.5;
		
		float f = 10.5f;
		Float f1 = 10.6f;
		//f= null; //�Ϲ� �ڷ����� null�� ���� �Ұ���
		//null : ���� �����ϵ� ��� �������� �𸣴� ��
		f1 = null; //���ڿ��� ���ڷ� ��ȯ�ϱ⵵ ������, null���� �����ϱ� ���ؼ� ����Ѵ�.
		
		
		
	}

}
