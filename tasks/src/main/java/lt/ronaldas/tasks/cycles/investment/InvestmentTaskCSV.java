package lt.ronaldas.tasks.cycles.investment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class InvestmentTaskCSV {

	public double[] makeMoney(double startingMoney, double incomeRate, int periods) {
		double[] data = new double[periods];

		for (int i = 0; i < periods; i++) {
			// data[i] = startingMoney;
			startingMoney = (startingMoney * incomeRate) + startingMoney;
			data[i] = startingMoney;
		}

		return data;
	}

	public static void main(String[] args) {
		InvestmentTaskCSV invest = new InvestmentTaskCSV();

		double[] rezult = invest.makeMoney(90000, 0.045, 25);

		String html = invest.makeCsv(rezult);

		invest.writeToFile(html);

	}

	private void writeToFile(String content) {

		try {
			Files.writeString(Paths.get("investment.csv"), content);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String makeCsv(double[] data) {

		String csvContent = "Period;Result\n";
		for (int i = 0; i < data.length; i++) {
			csvContent = csvContent + (i + 1) + ";" + data[i] + "\n";
		}
		return csvContent;

	}
}
