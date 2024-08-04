package inheritanceTest;

class Animal{
	String name;
	int age;
	String feed;
	
	public Animal() {;}
	//기본생성자 
	
	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}

	void walk() {
		System.out.println("걷기");
	}
	
	void run() {
		System.out.println("뛰기");
	}
	
	void eat() {	
		System.out.println("먹기");
	}
}

class Lion extends Animal{
	public Lion() {;}
	//기본생성자
	
	void hunt() {
		System.out.println("사냥하기");
	}
	@Override
	//재정의할 부모의 매소드 이름을 적당히 작성한뒤 ctrl + space 입력
	void walk() {
		System.out.print("네 발로 ");
		//걷기를 뻄
		super.walk();
		//부모의 walk에 "걷기"가 있다 
	}
	@Override
	void eat() {
		System.out.print("고기 ");
		super.eat();
	}
	
	
}

public class InheritacneTest2 {
	public static void main(String[] args) {
		Lion lion =new Lion();
		
		lion.walk();
		lion.run();
		lion.hunt();
		lion.eat();
	}
}
