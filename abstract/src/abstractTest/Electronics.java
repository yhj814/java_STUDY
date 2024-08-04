package abstractTest;

public abstract class Electronics {
	//무조건 재정의 하라
	 public abstract void on();
	 public abstract void off();
	 //추상메소드 선언하기
	 
	 public void printProduct() {
		 //재정의는 선택
		 //추상클래스 안에 일반 메소드 생성가능
		 System.out.println("전자제품");
	 }
	 public final void sos() {
		 //재정의 하지마라
		 //final 로 sos는 못불러옴
		 System.out.println("긴급 전화 119 연락");
		 
	 }
}

