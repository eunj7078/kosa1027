package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
	//�ڹ��� ����Ʈ�� �迭�� ����(ũ�� ����)�� �����ؼ� ����
		String str [] = {"����", "�ڹ�", "�ʹ�", "���ƿ�"};
		System.out.println(str.length); //�迭�� ũ�Ⱑ ����
		str[3] = "�����ƿ�";
		//str[4] = ".";
		//����Ʈ�� ũ�Ⱑ �������̴�. �迭�� �Ȱ��� ���� Ÿ�Ը� ������
		List list = new ArrayList(); //���̽��� ����Ʈ�� ���, �Ѱ��� �ڷ����� ���� �� �ִ�.
		list.add("�̼���");
		list.add("�̻��");
		list.add(1);
		System.out.println(list.get(0)); 
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		for(int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));			
		}
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		List<String> list1 = new ArrayList<String>();
		list1.add("�̼���");
		list1.add("�̻��");
		list1.add("�����");
		for(String s : list1) {
			System.out.println(s);	
		}
		
		int i = 10; 
		Object obj1 = 10; //�ڷ����� �������� �ʰ� �� ����� ����
		System.out.println(obj1);
		String st = "�̼���";
		obj1 = "�̼���";
		System.out.println(obj1);
		double d = 10.5;
		obj1 = 10.5;
		System.out.println(obj1);
		
		obj1 = new Calu();
		Calu calu = (Calu)obj1; //����� ���� ���� ����ȯ
		calu.setFirst(10);
		System.out.println(calu.getFirst());
	}
}
