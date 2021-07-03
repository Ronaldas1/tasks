package lt.ronaldas.tasks.cycles.output;

public class OutputGeometry {

	public static void main(String[] args) {

		int[] skaiciai = { 2, 5, 7, 0, 7, 22 };

		soundBars(skaiciai);

	}

	static void soundBars(int[] data) {

		for (int i = 0; i < data.length; i++) {

			
			for (int y = 0; y < data[i]; y++) {
				System.out.print(data[i]);
			}
			System.out.println();
		}

	}

}
