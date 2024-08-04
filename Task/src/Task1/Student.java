package Task1;

public class Student extends Person implements Studyable {
	public Student() {
	}

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void Study() {
		System.out.println(getName() + " is studying.");
	}

	@Override
	public void introduce() {
		System.out.println("Hi, I am " + getName() + " and I am " + getAge() + " years old..");
	}
}
