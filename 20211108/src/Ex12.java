
public class Ex12 {

	public static void main(String[] args) {
		//for Each : for�� Ȯ��
		int [] i ={1,2,3,4,5};
		int sum = 0;
		//�հ踦 ���Ͻÿ�
		for (int j = 0;j<i.length;j++) {
			sum += i[j];
		}
		System.out.println(sum);
		System.out.println("=================================");
		sum = 0; //�迭�� ũ�⸸ŭ�� �ݺ��Ѵ�.
		for (int k :i) { //k = i[0], k = i[1], k = i[2], ... ,k = i[4]
			sum +=k;
		}
		
		System.out.println(sum);
		System.out.println("=================================");
		int ii[][] = {{1,2,3,4}, {5,6}, {7,8,9,10,11}};
		sum  = 0;
		
		for(int row = 0;row<ii.length;row++) {
			for(int col = 0; col < ii[row].length;col++) {
				sum+=ii[row][col];
			}
		}
		System.out.println(sum);
		System.out.println("=================================");
		
		sum = 0;
		for (int [] row : ii) { 	// row = ii[0], row = ii[1], row = ii[2]
			for(int col : row) { 	// col = ii[0][0], col = ii[0][1], col = ii[0][2], col = ii[0][3]
				sum += col;			// row = ii[1]
			}						// col = ii[1][0], col = ii[1][1]
									// row = ii[2]
		}							// col = ii[2][0], col = ii[2][1], col = ii[2][2], col = ii[2][3], col = ii[2][4]
		System.out.println(sum);
		
	}

}
