package interfaceTest;

public interface Animal {
//	상수와 추상 메소드만 존재한다.
	int eyes = 2;
	//final static이 생략됨
	final static int nose = 1;
	//interface는 바뀌면 안되기 때문에 final static로 선언
	
	void showHands();
	//abstract 가 생략되어 있음
	abstract void sitDown();
	abstract void poop();
	abstract void waitNow();
}
