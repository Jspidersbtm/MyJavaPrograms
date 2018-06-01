package xyz;

public class Sample {

	void x() {
		System.out.println("x method");
		int x = 90 / 0;
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.x();
		System.out.println("Successfully completed");
	}

}
