package lt.ronaldas.tasks.cycles.output;

public class OutputMap {

	public static void main(String[] args) {

		// 3x3x2
		char[][][] gelmes = { { { 'G', 'G' }, // [0][0]
				{ 'G', 'A' }, // [0][1]
				{ 'G', 'G' } // [0][2]
				}, { { 'A', 'A' }, // [1][0]
						{ 'G', 'G' }, // [1][1]
						{ 'G', 'G' } // [1][2]
				}, { { 'G', 'G' }, // [2][0]
						{ 'A', 'G' }, // [2][1]
						{ 'A', 'G' } // [2][2]
				} };

		char tikslas = 'A';

		// System.out.println(gylioSkenavimas(gelmes[1][0], tikslas));
		int[][] kurGrezti = zemelapioSkenavimas(gelmes, tikslas);
		// TODO isvedimas

	}

	private static int gylioSkenavimas(char[] gylis, char ieskoma) {
		// TODO jei gylis atitiks: {'A','G'}
		// turi grazinti sluoksniu kieki, kiek rado ieskomo elemento
		// ieskoma: 'A' -> 1
		// ieskoma: 'G' -> 1
		// ieskoma: ... -> 0
		int kiekSurado = 0;
//		for (int i = 0; i < gylis.length; i++) {
//			if (gylis[i] == ieskoma) {
//				kiekSurado++;
//			}
//			//sluoksnis = gylis[i]
//		}
		for (char sluoksnis : gylis) {
			if (sluoksnis == ieskoma) {
				kiekSurado++;
			}
		}

		return kiekSurado;

	}

	private static int[][] zemelapioSkenavimas(char[][][] zemelapis, char tikslas) {
		// Skenuosim per X, Y
		// Skaiciuosim kiek ir desim reiksmes i int[][]

		// TODO
		// int z = 0;
		OutputMap k = new OutputMap();
		int auksas[][] = { {}, {} };
		// gylioSkenavimas (x++);
		k.gylioSkenavimas(null, tikslas);
		for (int x = k.gylioSkenavimas(null, tikslas); x < zemelapis.length; x++) {
			for (int y = k.gylioSkenavimas(null, tikslas); y < zemelapis.length; y++) {

				if (x == tikslas && y == tikslas) {
					// auksas[x][y]= new auksas[2];
					return auksas;
				}
			}
		}

		return auksas;
	}

}
