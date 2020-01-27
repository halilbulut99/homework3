package tests;

import homework3.Student;

public class MainTest {

	public static void main(String[] args) {

		Student student = new Student("Kostantin", 5511, "PU", "BIT", 3542);
		Student student1 = new Student("Toma", 7788, "PU", "SU", 1144);

		UnitTest.Speciality(student);
		UnitTest.Speciality(student1);

	}

}
