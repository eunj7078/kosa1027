
public class Ex07 {

	public static void main(String[] args) {
		char ch1 = 'A'+ 1; //2byte+2byte�� ���� : ���� + 2byte(����)
		System.out.println(ch1);
		char ch2 = 'C'; //����
		char ch3 = (char)(ch2 + 1);  //(char)4byte + 4byte
		
		short sh = 65 + 60;
		short sh1 = 65;
		short sh2 = 60;
		short sh3 = (short)(sh1 + sh2); //4����Ʈ�� ����
		
		float f1 = 10.5f; //4����Ʈ
		double d1 = 10.6; //8����Ʈ
		double d2 = d1 + f1; //8byte
		
		int result = (int)10.5 + 4;
		System.out.println(result);
		
		/*
		�ڷ��� 
		����: byte, char, short, int, long
		�Ǽ� : float, double
		���ڿ� : String, ""
		���� : char, ''
		�ο� : ture, false : 1byte
		char�� ���������� ������ �ڷ���
		 */
		char ch = 'a';
		ch = 97;
		
	}

}
