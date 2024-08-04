package staticTest;

class Data {
	int data;
	static int data_s = 11;
	//static 으로 바로 접근가능
	
	public Data() {;}
	// 기본생성자

	public Data(int data) {
		this.data = data;
	}

	void increase() {
		System.out.println(++data);
	}

	static void increase_s() {
	//this.즉 객체를 거치지 않고 바로 여기로 내려옴
		System.out.println(++data_s);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data(10);
		Data data2 = new Data();

//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
		data1.increase();
//		
//		data1 = new Data(10);
//		
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
		
		data2.increase_s();
	
		
	}
}
