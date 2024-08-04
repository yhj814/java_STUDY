package ambiguity;

public class ClassB extends ClassA implements InterA{
	
	//부모클래스의 public 메소드와 인터페이스의 default 메소드의 이름이 같을 때
	//자식클래스에서 재정의해서 쓸수 있다.
	@Override
	public void printName() {
		InterA.super.printName();
	}
	
	public static void main(String[] args) {
		new ClassB().printName();
	}
}
