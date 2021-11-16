package StringClass;

public class StringMethod {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		//			  01234567890123
		//						1
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1': 
		case '2': 
		case '3': System.out.println("����");	 break;
		case '4': System.out.println("����");	 break;
		}
		System.out.println(ssn.charAt(7));
		String str = "���� �ڹٰ� �ʹ� ����־��.";
		//			  01 234 5678910
		System.out.println(str.charAt(10));
		//charAt():index�� �ش��ϴ� ���ڸ� ������.
		
		//Method����
		
		String str1 = "apple";
		boolean b1 = str1.startsWith("ap"); //�ձ��ڰ� ap�� ������ ��, ������ true
		System.out.println(b1);
		b1 = str1.startsWith("le");
		System.out.println(b1);
		
		b1 = str1.endsWith("le");
		System.out.println(b1);
		
		str = new String("java");
		str1 = new String("java");
		System.out.println(str1 == str); //false
		System.out.println(str1.equals(str));
		
		str1 = "I like the java";
		//		012345678901234
		//				  1
		System.out.println(str1.indexOf("t"));//t�� �ִ� ��ġ�� ������
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));
		System.out.println(str1.length());
		
		int [] i1 = new int[5];
		System.out.println(i1.length); //length ����� �� �迭�� ��ȣ ���� �������� �� ����
		
		//I�� We
		System.out.println(str1.replace("I", "We"));
		//I�� i
		System.out.println(str1.replace("I", "i"));
		//I�� You : ����ǥ���� �ش��ϴ� ���ڸ� ����
		System.out.println(str1.replaceAll("I", "You"));
		
		str = "A:B:C:D:abcd"; //���ڿ��� split�� �ϸ� �迭�� ����
		String [] str2 = str.split(":");
		System.out.println(str2[1]);
		str = "A B C D abcd";
		str2 = str.split(" ");
		System.out.println(str2[1]);
		
		//slicing : a = "abcdef" : a[1:3] : substring
		str1 = "abcdef";
		System.out.println(str1.substring(1, 1+2)); //ù��° ���� ��, ������ + 1
		
		str1 = "abcDEF";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		Integer i = 10;
		str = "10"+i.toString(); //���ڸ� ���ڷ� ����
		System.out.println(str);
		
		str1 = " abc DEF "; //���̽㿡�� strip 
		System.out.println(str1.trim());
		
		str1 = "I like the java";
		int start = str1.indexOf("t");
		System.out.println(str1.substring(start, start+8));
		
		str = "A:B/C-D,abcd";
		str2 = str.split(":|/|-|,");
		System.out.println(str2[1]);
		
	}

}
