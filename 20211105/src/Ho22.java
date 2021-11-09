
public class Ho22 {

	public static void main(String[] args) {
		for(int i = 1;i<=15;i++) {
			for(int y = 1000; y>=0;y-=20) {
				for(int dan = 2 ;  dan <= 9; dan++){
					System.out.println(dan + "´Ü");
					for(int gop = 1; gop <= 9; gop++){
						System.out.println( dan + " * " + gop + " = " + dan*gop ); 
					}
				}
			}
			
		}	


	}

}
