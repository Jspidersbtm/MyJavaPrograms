
public class Lion extends Animal {
	String color = "Brown";

	void eat() {
		System.out.println(color + " " + super.color);
		System.out.print("Kill and ");
		super.eat();
	}

	public static void main(String[] args) {
		Lion l = new Lion();
		l.eat();

	}
}
