package lt.ronaldas.examples.variables;

public class Person {

	private String name = "No name";
	private double speed = 5; // Km/h

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double eiti(double time) {
		return speed * time;
	}

	public static void main(String[] args) {

		String text = "Vilnius"; // Su kintamuoju
		System.out.println(text);

		text = text.toUpperCase(); // per kintamaji...
		System.out.println(text);

		System.out.println("Vilnius"); // Tik reiksme, be kintamojo
		System.out.println("Vilnius".toUpperCase()); // Tik reiksme, be kintamojo

		// ----------------

		System.out.println(new Person().eiti(4)); // Sukiriam Person obj. ir paleidziam...

		/*
		 * [asmuo] => Person: name -> "Petras", speed -> 3
		 */

		Person asmuo = new Person(); // Sukuriam nauja Person ir priskiriam
		asmuo.setName("Petras");
		asmuo.setSpeed(3);

		System.out.println(asmuo.eiti(4));

		/*
		 * Person: name -> "Petras", speed -> 3 [asmuo] => Person: name -> "Jonas",
		 * speed -> 4
		 */

		asmuo = new Person(); // Sukuriam nauja Person ir priskiriam ir prarandam pries tai buvusi
		asmuo.setName("Jonas");
		asmuo.setSpeed(4);

		System.out.println(asmuo.eiti(4));

		// ----------------

		System.out.println(5 * 4);

		int greitis = 3;

		System.out.println(greitis * 4);

		greitis = 4;

		System.out.println(greitis * 4);
	}

}
