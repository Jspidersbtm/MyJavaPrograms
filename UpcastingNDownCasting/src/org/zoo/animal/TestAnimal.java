package org.zoo.animal;

public class TestAnimal {
	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.eat();
		m.sleep();
		m.jump();

		Animal a = m;
		a.eat();
		a.sleep();
		// not accessible because it is a sub class
		// specific method
		// a.jump();

		Object o = a;
		// o.eat();
		// o.sleep();
		// o.jum();
	}
}
