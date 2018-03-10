package pl.katarzynawojtowicz.constructors;

public abstract class Person {
	private String name;
	private int age;
	private Gender gender;
	private int shoeSize;

	public Person() {
		System.out.println("0 arguments constructor in Person: " + this.toString());
	}

	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("3 arguments constructor in Person: " + this.toString());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", shoeSize=" + shoeSize + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

}
