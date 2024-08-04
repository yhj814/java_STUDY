package accessTest1;

public class Access1 {
	int data1;
	public int data2;
	protected int data3;
	private int data4;
	
	public Access1() {;}

	
	
	
	//alt + Shift + s,r private 를 사용하기위한 단축키
	public int getData4() {
		//private 를 쓸때 접근하기 위한 메소드들
		return data4;
		//data4가 private로 정의가 되었기 때문에
	}

	public void setData4(int data4) {
		//private 를 쓸때 접근하기 위한 메소드들
		this.data4 = data4;
	}
	
}
