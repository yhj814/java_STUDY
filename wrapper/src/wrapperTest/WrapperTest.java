package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		
//		Wrapper Class
//		기본 자료형들의 클래스 타입
//		클래스타입 객체 = new 클래스타입(일반타입의 값);	//boxing
//		클래스타입 객체 = 클래스타입.valueOf(일반타입의 값);	//boxing
		
//		일반타입 변수 = 객체.000value();	//unboxing
		
		int data_i=10;
		
//	      boxing
//	      deprecated: 현재 버전부터는 사용하지 않는 것을 권장한다.
//	      Integer data_I = new Integer(data_i);					//1 잘안씀
	      Integer data_I = Integer.valueOf(data_i);				//2
//	      Integer data_I = data_i;								//3
	      
//	      unboxing
	      data_i = data_I.intValue();							//2
//	      data_i = data_I;										//3,1
	      System.out.println(data_i);
	}
}
