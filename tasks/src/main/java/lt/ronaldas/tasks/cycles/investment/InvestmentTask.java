package lt.ronaldas.tasks.cycles.investment;

import java.util.Iterator;

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
		
		
		 for( int i = 0; i < periods; i++ ) {
			 startingMoney = (startingMoney * incomeRate)+startingMoney;
			 //i++;
		 }
			
		

		return startingMoney;
	}

	public static void main(String[] args) {
		InvestmentTask rezult = new InvestmentTask();
		// Expecting: 133.1
		System.out.println(new InvestmentTask().makeMoney(100, 0.1, 3));
		System.out.println(rezult.makeMoney(100, 0.1, 1));

	}
}
