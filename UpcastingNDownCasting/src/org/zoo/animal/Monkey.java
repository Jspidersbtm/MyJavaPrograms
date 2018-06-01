package org.zoo.animal;

public class Monkey extends Animal {
	void jump() {
		System.out.println("Jump from tree to tree");
	}

	@Override
	void eat() {
		System.out.println("Eat with hands");
	}
}
