package anonymousTask;

public interface NikeForm {
	//인터페이스에는 추상메서드 상수만 가능하다 상수인경우 앞에 final static 이 생략된다 
	public String[] getMenu();
	//판매메뉴
	public abstract void sell(String order);
	//판매 메서드
	public abstract void soldOut(String order);
}
