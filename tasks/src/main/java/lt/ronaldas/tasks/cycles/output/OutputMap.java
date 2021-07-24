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
		// System.out.println();
		isvestiRezultata(kurGrezti);
		// System.out.println();
		// System.out.print(String.format(" %7s ",kurGrezti));
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

	private static int[][] zemelapioSkenavimas(char[][][] zemelapis3D, char tiksloElementas) {
		// Skenuosim per X, Y
		// Skaiciuosim kiek ir desim reiksmes i int[][]

		int rezultatas[][] = new int[zemelapis3D.length][zemelapis3D[0].length];

		for (int x = 0; x < zemelapis3D.length; x++) {
			for (int y = 0; y < zemelapis3D[0].length; y++) {

				rezultatas[x][y] = gylioSkenavimas(zemelapis3D[x][y], tiksloElementas);
			}

		}

		return rezultatas;
	}

//"Looking for a gold" þemëlapio iðvedimas á konsolæ.
	private static void isvestiRezultata(int[][] rezultatas) {

		for (int x = 0; x < rezultatas.length; x++) {
			for (int y = 0; y < rezultatas[x].length; y++) {

				System.out.print(rezultatas[x][y]);
				if (y != rezultatas[x].length - 1) {

					System.out.print("-");
				}

			}

			System.out.println();
		}

	}
}
