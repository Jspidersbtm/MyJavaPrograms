package org.overriding.tostringexample;

public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Alpha");
		System.out.println(s1);
		Student s2 = new Student(2, "Beta");
		System.out.println(s2);
		Student s3 = new Student(3, "Charlie");
		System.out.println(s3);
	}
}
