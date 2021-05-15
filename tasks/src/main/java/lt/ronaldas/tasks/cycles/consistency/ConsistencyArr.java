package lt.ronaldas.tasks.cycles.consistency;

public class ConsistencyArr {

	public boolean isConsistent(int[] values, int maxStep) {
		// TODO ar yra nuoseklumas per maxStep dydi
		// int i = 0;
		// int maxStep = values[i++] - values[i];
		for (int i = 0; i < values.length - 1; i++) {
			if (Math.abs(values[i] - values[i+1]) > maxStep ) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		int i = 0;
		int[] values = { 1, -2, 1, 8, 2, 1 };
		int maxStep = values[i++] - values[i];
		System.out.println(new ConsistencyArr().isConsistent(values, 7));
	}
}
