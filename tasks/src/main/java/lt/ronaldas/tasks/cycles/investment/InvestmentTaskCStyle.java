package lt.ronaldas.tasks.cycles.investment;

public class InvestmentTaskCStyle {

	/**
	 * Metodas kuris paskaiciuos kiek "priaugo" pinigu.
	 * 
	 * @param startingMoney - mano pradiniai pinigai. Investicija (kiek investuoju).
	 * @param incomeRate    - kiek procentais priauga per viena perioda. 10% ->
	 *                      0.10; 100% -> 1.0
	 * @param periods       - periodu kiekis.
	 * @return suma su visais pelnais ir pradine investicija.
	 */
	public double makeMoney(double sm, double ir, int p) {
		for (; 0 < p--; sm = (sm * ir) + sm) {
		}
		return sm;
	}

	public static void main(String[] args) {

		// Expecting: 133.1
		System.out.println(new InvestmentTaskCStyle().makeMoney(100, 0.1, 3));

	}
}
