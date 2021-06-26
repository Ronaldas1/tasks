package lt.ronaldas.examples.arr;

public class Arr {

	public void plot() {

		// {{0,0},{0,0},{0,0}}
		int[][] plot = new int[3][2];
//		plot[2] = 8; => {0,0} (arr x1)  << 8 (int);
		
//		plot[0][2] = 8;
//		plot[1][2] = 8;
//		plot[2][2] = 8;
		plot[3][2] = 8; // 3 !
		plot[2][1] = 8; // 0 (int) << 8 (int);
//		

	}
	
	
	public static void main(String[] args) {
		
		/* 
		 * {
		 * 	{0,0},  // 0
		 * 	{0,0},  // 1
		 * 	{0,9}   // 2
		 * } 
		 */
		int[][] matrix = new int[3][2];
		matrix[2][1] = 9;
		
		changeLast(matrix);
		
	}
	
	private static void changeLast(int[][] matrix) {
		
		/* 
		 *   0 1 2 ...
		 * {
		 * 	{0,0, ...}, // 0
		 * 	{0,0, ...}, // 1
		 * 	{0,0, ...}  // 2
		 * 	...			// ??...
		 * } 
		 */
		// 1)
		matrix[matrix.length -1][matrix[matrix.length -1].length - 1] = 9;
		
		// 2)
		int[] lastRow = matrix[matrix.length - 1];
		lastRow[lastRow.length - 1] = 9;
		
	}
	
}












