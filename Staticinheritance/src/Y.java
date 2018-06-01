
public class Y extends X {
	static void display() {
		System.out.println("Display y");
	}

	private void show() {
		System.out.println("Show class specific method");
	}

	public static void main(String[] args) {
		X.display();
		Y.display();
	}
}
