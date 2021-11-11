
public class ArrayTest {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i[] = new int[3];
		i[0] = i1; //i[0] = 10;
		i[1] = i2; //i[1] = 20;
		i[2] = i3; //i[2] = 30;
		System.out.println(i[0]); //������ �迭 ��ü
		
		//				Board��ü
		Board b1 = new Board(1, "�̼���", "����1", "����1", 0);
		Board b2 = new Board(2, "�̻��", "����2", "����2", 0);
		
		Board b[] = new Board[3]; //Board�� �迭 ��ü
		//b[0] = b1;
		b[0] = new Board(1, "�̼���", "����1", "����1", 0);
		b[1] = new Board(2, "�̻��", "����2", "����2", 0);
		b[2] = new Board(3, "�����", "����3", "����3", 0);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		for(int n : i) {
			System.out.println(n);
		}
		System.out.println(b1); //��ü�� �ִ� �޸� �ּ�
		System.out.println(b1.getNum()); 
		System.out.println(b1.getWriter());
		System.out.println(b1.getSubject());
		System.out.println(b1.getContent());
		System.out.println(b1.getReadCount());

		for(Board n : b) {
			System.out.print(n.getNum() +"      "); 
			System.out.print(n.getWriter()+"      ");
			System.out.print(n.getSubject()+"      ");
			System.out.print(n.getContent()+"      ");
			System.out.println(n.getReadCount());
		}
		
	}

}
