package com.reliancefresh.fruitsell;

public class Person {

	void eat() {
		Shop s = new Shop("Reliance Fresh");
		Fruit f = s.sell();
		if (f != null) {
			System.out.println(f.color + " " + f.price);
			f.prepareJuice();
			if (f instanceof Apple) {
				Apple a = (Apple) f;
				a.prepareSalad();
			} else if (f instanceof Mango) {
				Mango m = (Mango) f;
				m.preparePickle();
			}
		} else {
			System.out.println("no fruit at shop to sell");
		}
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
	}
}
