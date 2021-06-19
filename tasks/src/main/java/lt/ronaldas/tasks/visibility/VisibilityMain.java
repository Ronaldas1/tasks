package lt.ronaldas.tasks.visibility;

public class VisibilityMain {

	public static void main(String[] args) {

		final Visibility vis = new Visibility();

		vis.setText("AAA"); // Ok

//		vis.text = "BBB"; Only for local use

//		vis = null; // Error

	}
}
