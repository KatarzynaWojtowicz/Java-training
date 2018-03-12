package pl.katarzynawojtowicz.constructors;

public class Employee extends Person {
	private double salary;
	private String title;

	public Employee() {
		super();
		System.out.println("0 arguments constructor in Employee: " + this.toString());
	}

	public Employee(String name, int age, Gender gender, double salary, String title) {
		super(name, age, gender);
		this.salary = salary;
		this.title = title;
		System.out.println("5 arguments constructor in Employee: " + this.toString());
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", title=" + title + ", toString()=" + super.toString() + "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
