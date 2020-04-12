class Item {
	int id;
	String name;
	double price;
	char A = 18;

	//TODO add variable.

	//TODO constructor

	public Item(int id, String name, double price, char a) {
		this.id = id;
		this.name = name;
		this.price = price;
		A = a;
	}
	//TODO setters and getters


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getA() {
		return A;
	}

	public void setA(char a) {
		A = a;
	}

	double taxReturn () {
		return price * 18 /100;
	}
}