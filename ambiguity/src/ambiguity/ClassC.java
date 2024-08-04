package ambiguity;

public class ClassC implements InterA, InterB{
	
	@Override
	public void printName() {
		//두 인터페이스의 매개변수명이 같을 경우에 재정의하고
		InterB.super.printName();
		System.out.println("HI");
		//한번더 구현 가능
	}
	
	public static void main(String[] args) {
		
		new ClassC().printName();
	}
	
}
