package lt.ronaldas.tasks.cycles.simmetric;

public class OutputQueue {

	public static void main(String[] args) {
		String[] vardai = { "Justina", "Andrius", "Mindaugas", "Arminas", "Martynas", "Tomas" };

		System.out.println(" --- Reverse --- ");
		reverseOutput(vardai);
		System.out.println(" --- Even --- ");
		outEven(vardai);
		System.out.println(" --- Odd --- ");
		outOdd(vardai);
	}

	private static void reverseOutput(String[] vardai) {

		// 0, 1, 2... 0, -1, -2... => ... 3, 2, 1, 0
		// FIXME :)
		for (int i = 0; i < vardai.length; i++) {
			System.out.println("Vardas    : " + vardai[i]);
		}
	}

	// Lyginiai
	private static void outEven(String[] vardai) {
		// TODO
	}

	// Nelyginiai
	private static void outOdd(String[] vardai) {
		// TODO
	}
}
