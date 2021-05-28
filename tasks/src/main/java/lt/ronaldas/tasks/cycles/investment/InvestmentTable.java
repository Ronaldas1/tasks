package lt.ronaldas.tasks.cycles.investment;

// HTML heranrating
public class InvestmentTable {

	public double[] makeMoney(double startingMoney, double incomeRate, int periods) {
		double[] data = new double[periods];

		for (int i = 0; i < periods; i++) {
			// data[i] = startingMoney;
			startingMoney = (startingMoney * incomeRate) + startingMoney;
			data[i] = startingMoney;
		}

		return data;
	}

	public String makeHtml(double[] data) {
		data.toString();

		return data.toString();
	}

	public static void main(String[] args) {
		InvestmentTable invest = new InvestmentTable();
		double[] rezult = invest.makeMoney(100, 0.1, 3);
		for (int i = 0; i < rezult.length; i++) {
			System.out.println(rezult[i]);
		}

	}
}
