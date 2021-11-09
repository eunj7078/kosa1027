
public class Ex16 {

	public static void main(String[] args) {
		int [] i = {1,2,3,4,5,6};
		
		String [] str = {"이승무", "이상범", "이장범", "김찬중"};
		
		double [] d = {10.5, 20.6, 40.7, 200.8};
		
		WEEK1 [] days = WEEK1.values();
		
		String [][] locations = {{"영등포","노량진","종로"},{"가","나","다"},{"모란","수내","미금"}};
		
		int [][] vals = {{1,2,3},{4,5},{6,7,8,9}};
		//모두 for문과 foreach문 두가지 방법을 사용해서 출력하시오.
		
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
