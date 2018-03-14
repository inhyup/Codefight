package Interview;

public class RotateImage {

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3},
	                 {4, 5, 6},
	                 {7, 8, 9}};
		//printArray(a);
		rotateImage(a);
	}
	
	static int[][] rotateImage(int[][] a) {
		int[][] output = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				output[i][j] = a[a.length - j - 1][i];
			}
		}
		
		printArray(output);
		return output;
	}
	
	static void printArray(int[][] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
}
