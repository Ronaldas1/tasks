package lt.ronaldas.examples.variables;

public class House {

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {

		/*
		 *  [h1,h2] => House: address -> "Kalno 1"
		 * 
		 * */
		
		
		House h1 = new House();
		h1.setAddress("Vilniaus 13");
		System.out.println(h1.getAddress()); // Vilniaus 13
		
		House h2 = h1;
		System.out.println(h2.getAddress()); // Vilniaus 13
		
		h2.setAddress("Kalno 1");
		System.out.println(h2.getAddress()); // Kalno 1
		System.out.println(h1.getAddress()); // Kalno 1
	}

}
