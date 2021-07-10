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
		System.out.println(gelmes.length);
		//System.out.println();
		
	}
	
	private static int gylioSkenavimas(char[] gylis, char ieskoma) {
		// TODO jei gylis atitiks: {'A','G'}
		// turi grazinti sluoksniu kieki, kiek rado ieskomo elemento
		// ieskoma: 'A' -> 1
		// ieskoma: 'G' -> 1
		// ieskoma: ... -> 0
		char ieskoma1 = 'A';
		char ieskoma2 = 'G';
		for (char i = ieskoma1; i < gylis.length-1; i-- ) {
			for (char j = ieskoma2; j < gylis.length-1; j-- ) {
				//if (ieskoma = 'A')
				//return ieskoma2;
				//System.out.println("G  =" + ieskoma2);
			}
		}

		return ieskoma1; 
		
	}

	private static int[][] zemelapioSkenavimas(char[][][] zemelapis) {
		// Skenuosim per X, Y
		// Skaiciuosim kiek ir desim reiksmes i int[][]

		return null;
	}

}
