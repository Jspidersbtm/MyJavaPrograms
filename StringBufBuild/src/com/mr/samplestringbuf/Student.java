package com.mr.samplestringbuf;

public class Student {
	int id;

	Student(int id) {
		this.id = id;
		System.out.println(this.toString());
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);
		Student s4 = new Student(2);
		Student s11 = new Student(1);
		Student s21 = new Student(2);
		Student s32 = new Student(3);
		Student s42 = new Student(2);
		Student s15 = new Student(1);
		Student s26 = new Student(2);
		Student s37 = new Student(3);
		Student s48 = new Student(2);

	}

}
