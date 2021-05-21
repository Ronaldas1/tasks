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
		double startingMoney1 = 100;
		double incomeRate1 = 0.1;
		double periods1 = (startingMoney1 * incomeRate1)+startingMoney1;
		//periods = periods - 1;

		return 0.0;
	}

	public static void main(String[] args) {
		InvestmentTask rezult = new InvestmentTask();
		// Expecting: 133.1
		System.out.println(new InvestmentTask().makeMoney(100, 0.1, 3));
		System.out.println(rezult.makeMoney(100, 0.1, 1));

	}
}
