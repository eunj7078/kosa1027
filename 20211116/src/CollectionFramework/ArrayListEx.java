package CollectionFramework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		Date date;
		List list = new ArrayList();
		list.add("�̼���"); //object
		list.add("�̻��");
		list.add("�����");
		list.add("�����"); //����Ʈ������ ���� ���� ������ �ȴ�.
		list.set(3, "�̱湫");//����Ʈ�� �ִ� �� ����
		for(int i = 0;i<list.size();i++) {
			String s = (String)list.get(i); //String���� ��ȯ�ؼ� ���
			System.out.println(s);
		}
		//Object���� ����� ��� �Ʒ�ó�� ������� �ʴ´�.
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		//����ȯ�� ���� ����
		for(int i = 0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		//����Ʈ�� �ִ� ���� ����
		list1.remove(0);
		System.out.println(list1.size());
		System.out.println("===========================");
		System.out.println(list.size());
		for(Object obj : list) {
			String s  = (String)obj;
			System.out.println(s);
		}
		list.remove(0);
		System.out.println(list.size());
		list.remove("�̻��");
		System.out.println(list.size());
		list.clear(); //removeAll ��ſ� �̰� ���� ���� �ξ� ����
		//list.removeAll(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());//��������� true
		list.add("�̼���");
		System.out.println(list.isEmpty());//��������� true
		//add, remove, size, isEmpty, removeAll
	}

}
