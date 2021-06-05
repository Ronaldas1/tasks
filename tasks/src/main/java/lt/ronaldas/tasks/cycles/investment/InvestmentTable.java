package lt.ronaldas.tasks.cycles.investment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

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

		String htmlBegin = "<!DOCTYPE html><html><head><style>table, th, td {"
				+ "  border: 1px solid black;}</style></head><body style= \"font-family:Consolas,Monaco,Lucida Console,Liberation Mono,DejaVu Sans Mono,Bitstream Vera Sans Mono,Courier New, monospace;;\">"
				+ "<h2>Investment Periods Results Table</h2><p>Investment</p><table style=\"width:90%\">"
				+ "  <thead><th>Period</th><th>Result</th></thead>";
		
		String htmlMiddle = "";
		
		Locale lt = new Locale("lt");
		
		for (int i = 0; i < data.length; i++) {
			String money = String.format(lt, "%10.2f &euro;", data[i]);
			money = money.replaceAll(" ", "&nbsp;");
			htmlMiddle = htmlMiddle + "<tr><td>" + (i + 1) + "</td><td>" + money + "</td></tr>";
		}
		

		String htmlEnd = "</table></body></html>";
		return htmlBegin + htmlMiddle + htmlEnd;
	}

	public static void main(String[] args) {
		InvestmentTable invest = new InvestmentTable();

		double[] rezult = invest.makeMoney(90000, 0.045, 25);

		String html = invest.makeHtml(rezult);

		invest.writeToFile(html);

	}

	private void writeToFile(String content) {

		try {
			Files.writeString(Paths.get("investment.html"), content);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
