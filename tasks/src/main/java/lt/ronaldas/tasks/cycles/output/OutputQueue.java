package lt.ronaldas.tasks.cycles.output;

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
		for (int i = vardai.length - 1; i >= 0; i--) {
			System.out.println("Vardas    : " + vardai[i]);
			//break;
		}
	} 

	// Lyginiai
	private static void outEven(String[] vardai) {
		// TODO
		for (int i = 1; i < vardai.length; i+=2) {
			//if (i % 2 != 0)
				System.out.println("Even  : " + vardai[i]);
		}

	}

	// Nelyginiai
	private static void outOdd(String[] vardai) {
		// TODO
		for (int i = 0; i < vardai.length; i+=2) {
			//if (i % 2 == 0)
				System.out.println("Odd  :  " + vardai[i]);
		}
	}
}
