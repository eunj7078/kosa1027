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
		case '3': System.out.println("남자");	 break;
		case '4': System.out.println("여자");	 break;
		}
		System.out.println(ssn.charAt(7));
		String str = "나는 자바가 너무 재미있어요.";
		//			  01 234 5678910
		System.out.println(str.charAt(10));
		//charAt():index에 해당하는 문자를 가져옴.
		
		//Method정리
		
		String str1 = "apple";
		boolean b1 = str1.startsWith("ap"); //앞글자가 ap로 시작할 때, 맞으면 true
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
		System.out.println(str1.indexOf("t"));//t가 있는 위치를 가져옴
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));
		System.out.println(str1.length());
		
		int [] i1 = new int[5];
		System.out.println(i1.length); //length 사용할 때 배열만 괄호 없고 나머지는 다 있음
		
		//I를 We
		System.out.println(str1.replace("I", "We"));
		//I를 i
		System.out.println(str1.replace("I", "i"));
		//I를 You : 정규표현에 해당하는 문자를 변경
		System.out.println(str1.replaceAll("I", "You"));
		
		str = "A:B:C:D:abcd"; //문자열을 split을 하면 배열로 저장
		String [] str2 = str.split(":");
		System.out.println(str2[1]);
		str = "A B C D abcd";
		str2 = str.split(" ");
		System.out.println(str2[1]);
		
		//slicing : a = "abcdef" : a[1:3] : substring
		str1 = "abcdef";
		System.out.println(str1.substring(1, 1+2)); //첫번째 인자 수, 마지막 + 1
		
		str1 = "abcDEF";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		Integer i = 10;
		str = "10"+i.toString(); //숫자를 문자로 변경
		System.out.println(str);
		
		str1 = " abc DEF "; //파이썬에선 strip 
		System.out.println(str1.trim());
		
		str1 = "I like the java";
		int start = str1.indexOf("t");
		System.out.println(str1.substring(start, start+8));
		
		str = "A:B/C-D,abcd";
		str2 = str.split(":|/|-|,");
		System.out.println(str2[1]);
		
	}

}
