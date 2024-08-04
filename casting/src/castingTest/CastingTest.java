package castingTest;

class Car {
	private String brand;
	private String color;
	private int price;

	public Car() {;}
	//기본생성자 생성
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void engineStart() {
		System.out.println("열쇠로 시동 켜기");
	}

	public void engineStop() {
		System.out.println("열쇠로 시동 끄기");
	}

}

class SuperCar extends Car {
	private String mode;

	public SuperCar() {;}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		//car에 있는 생성자들을 super로 불러온거임 this로 재정의 필요 x 
		this.mode = mode;
		//superCar에만 추가한 생성자이기 때문에 this
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	//Car에 있는 enginStart 메소드를 불러오면서 추가 위해 오버라이딩을 해주고 super.메소드 명으로 불러옴
	public void engineStart() {
		super.engineStart();
		System.out.println("음성으로 시동 켜기");
	}

	public void openRoof() {
		System.out.println("뚜껑 열기");
	}

	public void closeRoof() {
		System.out.println("뚜껑 닫기");
	}

}

public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car("마티즈", "황금색", 250);
		SuperCar ferrari = new SuperCar("페라리", "빨간색", 750_000_000, "Sport");
		
//      up casting
		Car noOptionFerrari = new SuperCar();
		//최상의 클래스로 올려주기
		noOptionFerrari.engineStart();

//      오류
//		SuperCar borkenFerrari = (SuperCar) new Car();

//      down casting
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		//Car클래스로 올려준것을 Super클래스로 다운케스팅해줌
		fullOptionFerrari.openRoof();
		//슈퍼카 옵션을 쓸수 있는거임
		
//    	instanceof: 조건식
//    	객체 instanceof 타입: 참 또는 거짓

		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);

	}
}
