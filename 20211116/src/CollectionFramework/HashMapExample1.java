package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map �÷���
public class HashMapExample1 {
	public static void main(String[] args) {
		//��ųʸ� dic = {"a":1, "b":2} : Map 
		//print(dic["a"] // dic.keys()
		//Map�� key�� value �� �� ����
		//�÷���: value�� ���� 
		List<String> list = new ArrayList<String>();
		list.add("�̼���");
		//Map �÷��� ���� : Map<Ű, ��>
		//	  Ű 		��
		Map<String, Integer> map = new HashMap<String, Integer>();
		//��ü ����
		map.put("�̼���", 35);
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); //�ߺ� Ű�� ������� �ʴ´�. //���� ����
		System.out.println("map�� ũ��� "+ map.size());
		System.out.println("�̼����� ���̴� " + map.get("�̼���")+ "�� �Դϴ�.");
		
		//Ű�� ������ ����, ������ ����
		map.put("�̼���", 16); //Ű�� ���� ������ �� �ִ�.
		
		Set<String> keySet = map.keySet(); //Ű�� �����ϸ� Set �ڷ������� ������
		for (String key : keySet) {
			System.out.println(key+"�� ���̴� "+map.get(key)+"�� �Դϴ�.");
		}
		
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map.get(key));
		}
		System.out.println("=================================");
		map.remove("ȫ�浿");
		System.out.println(map.size());
		map.clear(); //��ü ����
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		
		
	}
}
