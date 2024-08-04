package Task1;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	//기본생성자
	public Person() {;}
	
	//초기화생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person person = (Person) o;
		return age == person.age && Objects.equals(name, person.name);
	}
	
	//일반 메소드 생성	
	public void introduce() {
		System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
	}
}