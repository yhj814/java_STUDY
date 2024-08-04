package classTest;

class A {
//   전역 변수
   int data1;
   
//   지역 변수
   A(int data){
	   //생성자로 생성자의 이름은 클래스의 이름과 같아야함
      System.out.println("생성자 호출");
      System.out.println(data);
      //주소
      this.data1 = data;
   }
   
   void printData() {
	   //메소드
      System.out.println(data1);
   }
}

public class ClassTest {
   public static void main(String[] args) {
//      객체화
      A a = new A(30); 
// 클래스이름 객체변수 = 생성자(A)==기능은 메소드와 같음(값)
      //A b = new A(20);
      
      a.printData();
      //객체의 메서드를 사용 가능   -> 방법 클래스 찾아가고 그 클래스에 값이 들어가면 값을 넣고 this로 주소값만 받은다음 그 변수를 다른 메서드에 담아 
      //						객체.메서드를 써서 사용가능.
      //b.printData();
     
      
//      System.out.println(a);
//      System.out.println(a.data);
//      a.data = 10;
//      System.out.println(a.data);
//      
//      System.out.println(b.data);
//      
//      System.out.println(a);
//      System.out.println(b);
   }
}

