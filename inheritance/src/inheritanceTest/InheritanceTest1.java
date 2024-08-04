package inheritanceTest;

class A {
	// 부모클래스
	String name;
	int age;

	public A() {;}
	// 기본생성자를 만들면 B클래스 에서 오류가 안남

	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}

class B extends A {
	// B 클래스는 A클래스를 상속받았다
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B();
		
		System.out.println(b.name);
		System.out.println(b.age);
		//B 클래스에 아무것도 없지만 출력되는 이유가 A클래스에서 상속을 받았기 떄문에 받을수 있다.
		
		
	}
}
