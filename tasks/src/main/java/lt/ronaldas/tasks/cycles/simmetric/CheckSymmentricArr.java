package lt.ronaldas.tasks.cycles.simmetric;

/**
 * 
 * Check if arr symmetric or not
 * 
 * 
 *
 * <pre>
		i:		 0  1  2  3  4  5  6
		[]:		[0, 1, 2, 3, 2, 1, 0]
		 
		i:		 0  1  2  3  4  5
		[]:		[a, b, c, c, b, a]
 * </pre>
 * 
 * 
 * 
 */
public class CheckSymmentricArr {

	public boolean isSummetric(String... arr) {

		int center = arr.length / 2;
		int lastIndex = arr.length - 1;

		for (int i = 0; i < center; i++) {
			if (!arr[i].equalsIgnoreCase(arr[lastIndex - i])) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(new CheckSymmentricArr().isSummetric("1", "2", "4", "4", "2", "1"));

		// Anna
		System.out.println(new CheckSymmentricArr().isSummetric("A", "n", "n", "a"));

		// Anna The same! but with streams
		System.out.println(new CheckSymmentricArr()
				.isSummetric("Anna".chars().mapToObj(Character::toString).toArray(String[]::new)));

	}

}
