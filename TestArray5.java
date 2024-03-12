/**
 * TA5 - adding two matrices
 *
 */

class TestArray5{
	public static void main(String args[]){
		/* creating two matrices */
		int a[][] = {{1, 3, 4}, {3, 4, 5}};
		int b[][] = {{1, 3, 4}, {3, 4, 5}};

		/* creating another matrix to store the sum of the two */
		int c[][] = new int[2][3];

		/*adding and printing addition of the two */
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 3; j++){
				c[i][j] = a[i][j] + b[i][j];
				System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
