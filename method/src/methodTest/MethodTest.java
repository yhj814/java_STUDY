package methodTest;

public class MethodTest {
   
//   f(x) = 2x + 1
   
   int f(int x) {
	   //f라는 이름을 가진 메서드는 정수값을 받았기때문에 int형 이고 그안에 x라는 값을 받았다
      return 2 * x + 1;
      //메인 메서드에서 값을 받았기때문에 return 을 써서 반환해준다
   }
   
//   static
//   컴파일러가 가장 먼저 메모리에 할당해준다.
//   일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재한다.
//   1. 일반 메소드에 static을 작성하여 같은 시간대에 메모리로 올려준다.
//   2. 일반 메소드가 소속된 클래스를 Heap 메모리에 할당(new)하여 static이 찾을 수 있도록한다.
//      즉, 메소드의 소속을 알려준다.
   public static void main(String[] args) {
      MethodTest methodTest = new MethodTest();
//    클래스 이름    변수이름            클래스이름
      int result = methodTest.f(25);
      //methodTest 이름을가진 f라는 메서드에 값25를 준 결과를 f라는 메서드에서 해결한 결과를 result에 저장한다
      // 순서 
      //1. 클래스이름 과 변수이름 정의 20번째줄
      //2. 메서드를 사용하려면 클래스 안에 메서드를 만들어 클래스 변수이름.메서드이름 방식으로 사용
      System.out.println(result);
   }
}
