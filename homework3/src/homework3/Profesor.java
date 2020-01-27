package homework3;

import java.util.Calendar;

public class Profesor extends Person {

	private String title;

	public Profesor(String title, String name, boolean isMale, int age, int height, int weight) {
		super(name, isMale, age, height, weight);
		this.title = title;

	}

	public void Profesor() {

	}

	@Override
	public String toString() {
		return String.format("The professor %s is with title %s", this.getName(), this.getTitle());
	}

	@Override
	protected String getTypicalDrink() {
		return "50 years Black Johny";
	}

	@Override
	public void goBar() {
		super.goBar();
		System.out.println("After second drink the Professor is happy");
	}

	@Override
	public void getUpEarly(Calendar hour) {
		System.out.println("The professor usually gets up at" + hour);
	}

	@Override
	public void run(int minutes) {
		// TODO Auto-generated method stub
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
	}

	// Getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void thing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getUpEarly1(Calendar hour) {
		// TODO Auto-generated method stub

	}
}