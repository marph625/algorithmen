package Experiment1;

public class _2D_Array {

	public static void main(String[] args) {
		
		int l = 3;
		int b = 3;
		char c = '*';
		
		int twoDimensionalArray[][] = new int[l][b];
		
		for (int i = 0; i < twoDimensionalArray.length; i++) {
			twoDimensionalArray[0][i] = c;
			twoDimensionalArray[i][0] = c;
			System.out.print((char)twoDimensionalArray[0][i]);
			System.out.println();
			System.out.print((char)twoDimensionalArray[i][0]);
		}		
	}
}
