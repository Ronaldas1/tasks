package lt.ronaldas.tasks.cycles.investment;

public class InvestmentTask {

	/**
	 * Metodas kuris paskaiciuos kiek "priaugo" pinigu.
	 * 
	 * @param startingMoney - mano pradiniai pinigai. Investicija (kiek investuoju).
	 * @param incomeRate    - kiek procentais priauga per viena perioda. 10% ->
	 *                      0.10; 100% -> 1.0
	 * @param periods       - periodu kiekis.
	 * @return suma su visais pelnais ir pradine investicija.
	 */
	public double makeMoney(double startingMoney, double incomeRate, int periods) {

		return 0.0;
	}

	public static void main(String[] args) {

		// Expecting: 133.1
		System.out.println(new InvestmentTask().makeMoney(100, 0.1, 3));

	}
}
