
public class Ex16 {

	public static void main(String[] args) {
		int [] i = {1,2,3,4,5,6};
		
		String [] str = {"�̽¹�", "�̻��", "�����", "������"};
		
		double [] d = {10.5, 20.6, 40.7, 200.8};
		
		WEEK1 [] days = WEEK1.values();
		
		String [][] locations = {{"������","�뷮��","����"},{"��","��","��"},{"���","����","�̱�"}};
		
		int [][] vals = {{1,2,3},{4,5},{6,7,8,9}};
		//��� for���� foreach�� �ΰ��� ����� ����ؼ� ����Ͻÿ�.
		
		for(int j = 0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("");
		
		for(int a : i) {
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		for(int j = 0;j<str.length;j++) {
			System.out.println(str[j]);
		}
		
		System.out.println("");
		
		for(String a : str) {
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		for(int j = 0;j<d.length;j++) {
			System.out.println(d[j]);
		}
		
		System.out.println("");
		
		for(double a : d) {
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		for(int j = 0;j<days.length;j++) {
			System.out.println(days[j]);
		}
		
		System.out.println("");
		
		for(WEEK1 a : days) {
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		for(int j = 0;j<locations.length;j++) {
			for(int k = 0;k<locations[j].length;k++) {
				System.out.println(locations[j][k]);
			}
		}
		
		System.out.println("");
		
		for (String []a : locations) {
			for(String b : a) {
				System.out.println(b);
			}
		}
		System.out.println("===========================");
		
		for(int j = 0 ; j<vals.length ; j++) {
			for(int k = 0;k<vals[j].length;k++) {
				System.out.println(vals[j][k]);
			}
		}
		
		System.out.println("");
		
		for (int []a : vals) {
			for(int b : a) {
				System.out.println(b);
			}
		}
		
		
	}

}
