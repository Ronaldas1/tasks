package lt.ronaldas.tasks.cycles.output;

public class OutputMap {

	public static void main(String[] args) {

		// 3x3x2
		char[][][] gelmes = {
				{
					{'G','G'}, // [0][0]
					{'G','A'}, // [0][1]
					{'G','G'}  // [0][2]
				},{
					{'A','A'}, // [1][0]
					{'G','G'}, // [1][1]
					{'G','G'}  // [1][2]
				},{
					{'G','G'}, // [2][0]
					{'A','G'}, // [2][1]
					{'A','G'}  // [2][2]
				}
		};
		
		char tikslas = 'A';
		
		System.out.println( gylioSkenavimas(gelmes[2][1], tikslas));
		
	}
	
	private static int gylioSkenavimas(char[] gylis, char ieskoma) {
		// TODO jei gylis atitiks: {'A','G'}
		// turi grazinti sluoksniu kieki, kiek rado ieskomo elemento
		// ieskoma: 'A' -> 1
		// ieskoma: 'G' -> 1
		// ieskoma: ... -> 0

		return 0;
	}

	private static int[][] zemelapioSkenavimas(char[][][] zemelapis) {
		// Skenuosim per X, Y
		// Skaiciuosim kiek ir desim reiksmes i int[][]

		return null;
	}

}
