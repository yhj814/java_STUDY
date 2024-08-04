package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class StreamTest {

	public static int getDoubleTime(int data) {
		return data * 2;
	}

	public static boolean checkEven(int data) {
		return data % 2 == 0;
	}

	public static void main(String[] args) {
//      JAVA에서는 배열이 Arrays 객체이다.
//      Arrays.asList() 메소드는 가변인자를 받기 때문에, 여러 개의 값을 전달할 수도 있고
//      시작 주소를 가지고 있는 배열을 전달하면, 마지막 주소까지 읽어나가면서 모든 값들을 List에 넣고 리턴해준다.

//      배열을 ArrayList로 변경하는 방법
//      Integer[] arData = {10, 20, 30, 40, 50};
//      ArrayList<Integer> datas = new ArrayList<>(Arrays.asList(arData));
//      System.out.println(datas);

//      ArrayList를 배열로 변경하는 방법
//      Integer[] arData = {10, 20, 30, 40, 50};
//      ArrayList<Integer> datas = new ArrayList<>(Arrays.asList(arData));
//      Object[] arNumber = datas.toArray();
//      for (int i = 0; i < arNumber.length; i++) {
//         System.out.println((Integer)arNumber[i]);
//      }

//      IntStream: 정수를 다루는 Stream API
//      IntStream.range(1, 11).forEach((number) -> {System.out.println(number);});
//		//1부터 10까지 반복하려면 11입력

//      IntStream.rangeClosed(1, 10).forEach((number) -> {System.out.println(number);});
//		//rangeClosed 하면 딱 그 값까지만 반복한다 뜻 , 아래 코드와 같음

//      for (int i = 1; i < 11; i++) {
//         System.out.println(i);
//      }

//      forEach(): 반복
//      여러 값을 가지고 있는 컬렉션 객체 또는 Stream API에서 forEach 메소드를 사용할 수 있다.
//      forEach() 메소드에는 Consumer 인터페이스 타입의 값(구현체)을 전달해야 한다.
//      Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//      매개변수에는 컬렉션 객체 또는 Stream 객체 안에 있는 값들이 순서대로 담기고,
//      화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
//      ArrayList<String> colors = new ArrayList<>(Arrays.asList("검은색", "빨간색", "녹색"));
//    											//이렇게 바로 넣을수 있음
//      colors.forEach((color) -> {System.out.println(color);});
//				//값을 받을 매개변수

//      참조형(객체명::메소드명)
//      매개변수로 전달받은 값을 다른 메소드에 넣는 작업만 한다면,
//      아래와 같이 참조형 문법을 사용하여 전달할 수 있다.
//		ArrayList<String> colors = new ArrayList<>(Arrays.asList("검은색", "빨간색", "녹색"));
//		colors.forEach(System.out::println);
//					//(color) -> {System.out.println(color);}) 이거를 줄인코드

//      map(): 기존 값 변경
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      								//add라는 메소드가 있어 참조형 문법으로 사용가능
////      //1부터 10까지 반복해서 datas에 추가한다
//      datas.stream().map((data) -> data * 2).forEach(System.out::println);
//      //원래 있던 값 변경 1~10 안에 수를 2곱해서 반복해 출력한다

//		메소드 사용해서 하기
//	  ArrayList<Integer> datas = new ArrayList<Integer>();
//	  IntStream.rangeClosed(1, 10).forEach(datas::add);
//      datas.stream().map(StreamTest::getDoubleTime).forEach(System.out::println);
//      					//클래스:: 메소드(static)으로 코딩

//      ArrayList<User> users = new ArrayList<User>(Arrays.asList(new User(1, "한동석", 20), new User(2, "홍길동", 18)));
//      													//배열을 따로 만들지 않고 asList 에 바로생성
//      users.stream().map(User::getAge).map((age) -> age / 2).forEach(System.out::println);
		// User 클래스에서 가져옴 나이를 반으로 그후 나이만 반복출력

//      filter(): 조건식이 true일 경우만 추출
//      IntStream.rangeClosed(1, 10).filter((data) -> data % 2 == 0).forEach(System.out::println);
//      //								1~10중에 짝수만 출력 if문 같은거 		그후 반복 출력

//      IntStream.range(1, 11).filter(StreamTest::checkEven).forEach(System.out::println);
////      							메소드 써서도 사용가능 				

//      chars(): 문자열을 IntStream으로 변경
//      String data = "ABC";
//      data.chars().forEach(System.out::println);
////      바로 숫자로 변경가능

//		String data = "ABC";
//		data.chars().map((c) -> (char) c).forEach(System.out::println);
////					//문자로 바꾼후 숫자로 출력됨
//		String data = "ABC";
//		data.chars().forEach((c) -> System.out.println((char) c));
////								람다로 받고	   		값 받는곳에서 형변환

//      sorted(): 정렬
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      StreamTest streamTest = new StreamTest();
//      IntStream.range(0, 10).map(streamTest::plus1).forEach(datas::add);
//      Collections.shuffle(datas);
//      System.out.println(datas);
//      datas.stream().sorted().forEach(System.out::println);
//      datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

//      collect(): 결과를 다양한 타입으로 리턴해준다.
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(30, 20, 90, 40, 80));
//      datas.sort(null);
//      datas.sort(Collections.reverseOrder());

//      ArrayList<Integer> doubleTimeOfDatas = (ArrayList<Integer>) datas.stream().map(StreamTest::getDoubleTime).collect(Collectors.toList());
//      List<Integer> doubleTimeOfDatas = datas.stream().map(StreamTest::getDoubleTime).toList();
//      System.out.println(doubleTimeOfDatas);

//      ArrayList<String> colors = new ArrayList<>(Arrays.asList("검은색", "흰색", "파란색"));
//      System.out.println(colors.stream().collect(Collectors.joining("::")));

	}
}
