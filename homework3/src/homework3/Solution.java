package homework3;

import java.util.ArrayList;

public class Solution {

	public static void addPeople(ArrayList<Person> people) {
		people.add(new Student("Ivan", 123, "PU", "7852", 1122));
		people.add(new Student("Gergana", 12332, "PU", "758852", 15122));
		people.add(new Student("Ivana", 12341, "PU", "787852", 223366));
		people.add(new RichStudent2("Toma", 7788, "PU", "SU", 1144));
		people.add(new Profesor("Profesor", "Dimitar", true, 32, 173, 80));
		people.add(new Profesor("Profesor", "Denis", true, 50, 190, 100));
		people.add(new Profesor("Profesor", "Kosta", true, 47, 183, 82));
		people.add(new RichStudent2("Kostantin", 5511, "PU", "BIT", 3542));
		people.add(new Profesor("Profesor", "Valeri", true, 34, 171, 72));
		people.add(new Profesor("Profesor", "Vasilka", true, 43, 197, 87));
	}

	public static void showStats(ArrayList<Person> people) {

		int studentCounter = 0;
		int profesorCounter = 0;
		int richStudent2Counter = 0;

		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) instanceof RichStudent2) {
				System.out.println("I'm a rich student  " + people.get(i).getClass().getSimpleName());
				richStudent2Counter++;

			} else if (people.get(i) instanceof Profesor) {
				System.out.println("I'm a professor  " + people.get(i).getClass().getSimpleName());
				profesorCounter++;
			} else {
				System.out.println("I'm a student  " + people.get(i).getClass().getSimpleName());
				studentCounter++;
			}
		}

		System.out.print("The number of students are: " + studentCounter );
		System.out.println();
		System.out.print("The number of professors are: "+ profesorCounter);
		System.out.println();
		System.out.print("The number of rich students are: " + richStudent2Counter);
		System.out.println();
		System.out.print("The total people here are: " + (studentCounter + profesorCounter + richStudent2Counter));
		System.out.println();

		for (int i = 0; i < people.size(); i++) {
			if (!(people.get(i) instanceof Profesor)) {
				people.get(i).study();
			}
		}
	}

	public static void testAnonymousClass() {

		Student student = new Student("Gergana", 12332, "PU", "758852", 15122) {

			@Override
			public void study() {
				System.out.println(" The student is studying.");
			}

			@Override
			public void think() {
				System.out.println(" The student is thinks how to write homework.");
			}

			@Override
			public void act() {
				System.out.println(" The student is acting at the moment.");
			}
		};
		student.study();
		student.think();
		student.act();
	}

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();

		addPeople(people);
		showStats(people);
		testAnonymousClass();

	}
}