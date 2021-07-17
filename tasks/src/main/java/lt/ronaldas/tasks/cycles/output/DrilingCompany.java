package lt.ronaldas.tasks.cycles.output;

public class DrilingCompany {

	public static void main(String[] args) {

		// 3x3x2
		char[][][] gelmes = { { { 'G', 'G', 'G', 'G' }, { 'R', 'A', 'G', 'G' }, { 'G', 'G', 'G', 'G' } },
				{ { 'A', 'A', 'G', 'G' }, { 'G', 'G', 'G', 'G' }, { 'G', 'G', 'G', 'G' } },
				{ { 'G', 'G', 'G', 'G' }, { 'A', 'R', 'G', 'G' }, { 'A', 'R', 'A', 'R', 'A', 'A', 'A' } } };

		char tikslas = 'A';
		double tikslasKaina = 50.0;

		GrezimoSavikaina[] savikaina = new GrezimoSavikaina[3];
		savikaina[0] = new GrezimoSavikaina();
		savikaina[0].setElementas('A');
		savikaina[0].setKaina(5.0);

		savikaina[1] = new GrezimoSavikaina();
		savikaina[1].setElementas('G');
		savikaina[1].setKaina(2.0);

		savikaina[2] = new GrezimoSavikaina();
		savikaina[2].setElementas('R');
		savikaina[2].setKaina(25.0);

		double[][] islaiduZemelapis = kasimoKainosZemelapis(gelmes, tikslas, savikaina, 1.47);
		double[][] pelnoZemelapis = zemelapioSkenavimas(gelmes, tikslas, tikslasKaina);
		double[][] grynasPelnas = minus(pelnoZemelapis, islaiduZemelapis);

		// Kasimo kainos zemelapis
		System.out.println("Islaidos");
		outToConsole(islaiduZemelapis, null);

		System.out.println();
		System.out.println("Pelnas");
		outToConsole(pelnoZemelapis, null);

		System.out.println();
		System.out.println("Grynas pelnas");
		outToConsole(grynasPelnas, 'X');

	}

	private static double[][] minus(double[][] grezimoKainos, double[][] tankioZemelapis) {
		double rezultatas[][] = new double[grezimoKainos.length][grezimoKainos[0].length];
		for (int x = 0; x < grezimoKainos.length; x++) {
			for (int y = 0; y < grezimoKainos[0].length; y++) {
				rezultatas[x][y] = grezimoKainos[x][y] - tankioZemelapis[x][y];
			}
		}

		return rezultatas;
	}

	private static int gylioSkenavimas(char[] gylis, char ieskoma) {
		int kiekSurado = 0;
		for (char sluoksnis : gylis) {
			if (sluoksnis == ieskoma) {
				kiekSurado++;
			}
		}
		return kiekSurado;
	}

	private static double[][] zemelapioSkenavimas(char[][][] zemelapis3D, char tiksloElementas, double kaina) {
		double rezultatas[][] = new double[zemelapis3D.length][zemelapis3D[0].length];
		for (int x = 0; x < zemelapis3D.length; x++) {
			for (int y = 0; y < zemelapis3D[0].length; y++) {
				rezultatas[x][y] = gylioSkenavimas(zemelapis3D[x][y], tiksloElementas) * kaina;
			}
		}
		return rezultatas;
	}

	private static void outToConsole(double[][] kainos, Character instreadZero) {
		for (int i = 0; i < kainos.length; i++) {
			for (int j = 0; j < kainos.length; j++) {
				if (instreadZero != null && kainos[i][j] == 0) {
					System.out.print(String.format(" %7s ", instreadZero));
				} else {
					System.out.print(String.format(" %7.2f ", kainos[i][j]));
				}

			}
			System.out.println();
		}
	}

	private static double[][] kasimoKainosZemelapis(char[][][] zemelapis3D, char tiksloElementas,
			GrezimoSavikaina[] kainorastis, double pabrangimasPerSluoksni) {

		double[][] kainos = new double[zemelapis3D.length][zemelapis3D[0].length];

		for (int x = 0; x < zemelapis3D.length; x++) {
			for (int y = 0; y < zemelapis3D[0].length; y++) {

				int giliausiasSluoksnis = suraskGiliausia(zemelapis3D[x][y], tiksloElementas);
				if (giliausiasSluoksnis > -1) {
					double grezinioKaina = 0;
					for (int z = 0; z <= giliausiasSluoksnis; z++) {
						grezinioKaina += vienoSluoksnioKaina(kainorastis, z, pabrangimasPerSluoksni,
								zemelapis3D[x][y][z]);
					}
					kainos[x][y] = grezinioKaina;
				}
			}
		}
		return kainos;
	}

	private static double vienoSluoksnioKaina(GrezimoSavikaina[] kainorastis, int sluoksnis,
			double pabrangimasPerSluoksni, char elementas) {

		double kaina = 1.0;
		for (int i = 0; i < kainorastis.length; i++) {
			if (kainorastis[i].getElementas() == elementas) {
				kaina = kainorastis[i].getKaina();
				break;
			}
		}

		return kaina * (sluoksnis == 0 ? 1 : (pabrangimasPerSluoksni * sluoksnis));
	}

	private static int suraskGiliausia(char[] zAsis, char tiksloElementas) {

		for (int i = 0; i < zAsis.length; i++) {
			if (zAsis[zAsis.length - 1 - i] == tiksloElementas) {
				return zAsis.length - 1 - i;
			}
		}
		return -1;
	}

	private static class GrezimoSavikaina {
		private char elementas;
		private double kaina;

		public char getElementas() {
			return elementas;
		}

		public void setElementas(char elementas) {
			this.elementas = elementas;
		}

		public double getKaina() {
			return kaina;
		}

		public void setKaina(double kaina) {
			this.kaina = kaina;
		}

	}

}
