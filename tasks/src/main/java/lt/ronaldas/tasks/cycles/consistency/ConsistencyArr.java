package lt.ronaldas.tasks.cycles.consistency;

public class ConsistencyArr {

	public boolean isConsistent(int[] values, int maxStep) {
		// TODO ar yra nuoseklumas per maxStep dydi
		// int i = 0;
		// int maxStep = values[i++] - values[i];
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i++] - values[i] == values[1] - values[0]) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int i = 0;
		int[] values = { 1, 2, 4, 4, 2, 1 };
		int maxStep = values[i++] - values[i];
		System.out.println(new ConsistencyArr().isConsistent(values, 0));
	}
}
