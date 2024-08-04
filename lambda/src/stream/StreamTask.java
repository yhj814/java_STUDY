package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {

	public static int minus10(int data) {
		return 10 - data;
	}

	public static void main(String[] args) {
//      1~10까지 ArrayList에 담고 출력
//      Integer[] arData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//      System.out.println(datas);
      
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//      System.out.println(datas);
      
//      참조형(객체명::메소드명)
//      매개변수로 전달받은 값을 다른 메소드에 넣는 작업만 한다면,
//      아래와 같이 참조형 문법을 사용하여 전달할 수 있다.
//	    ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 10).forEach((data) -> {datas.add(data);}); 
//      System.out.println(datas);
      
//		위에것을 참조형으로 줄인게 이거
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 10).forEach(datas::add); 
//      System.out.println(datas);
      
//      10~1까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//	    IntStream.rangeClosed(0, 9).forEach((data) -> {datas.add(10 - data);}); //받을 값에서 연산가능
//	    System.out.println(datas);
	    
//      upgrade: 짝수만 출력
//	    ArrayList<Integer> datas = new ArrayList<Integer>();
//	    IntStream.rangeClosed(0, 10).forEach((data) -> {datas.add(data);});
//	    IntStream.range(0, 5).forEach((data) -> {System.out.println(datas.get(data+1)*2);});
//	    	2 4 6 8 10 5개만 출력해야하므로 5		
      
//      10~1까지 ArrayList에 담고 출력 (map 사용)
//      ArrayList<Integer> datas = new ArrayList<>();
//      IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//      System.out.println(datas);
      
//      10~1까지 ArrayList에 담고 짝수만 출력 (map 사용)
//      ArrayList<Integer> datas = new ArrayList<>();
//      IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//      datas.stream().forEach((data) -> {if(data % 2 == 0) {System.out.println(data);}});
      
//      10~1까지 ArrayList에 담고 짝수만 출력 (map, filter 사용)
//		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//		datas.stream().filter((data) -> data % 2 == 0).forEach(System.out::println);
//	    				간단하게 줄이기 가능							참조형으로 바꾸기
	   
//     실습
	   
//     ABCDEF를 각 문자별로 출력
//     String data = "ABCDEF";
//     data.chars().forEach((c) -> System.out.println((char)c));
//     									형변환 해줘야함 
     
//     1~100까지 중 홀수만 ArrayList에 담고 출력
//     ArrayList<Integer> datas = new ArrayList<Integer>();
//     IntStream.rangeClosed(1, 100).filter((data) -> data % 2 == 1).forEach(datas::add);
//     System.out.println(datas);
     
//     A~F까지 중 D제외하고 ArrayList에 담은 뒤 출력
//     ArrayList<Character> datas = new ArrayList<Character>();
//     IntStream.range(0, 5)
////     			A,B,C,E,F 
//        .map((i) -> i > 2 ? i + 66 : i + 65)
////        	D가 3이므로 2보단 커야함		
//           .forEach((data) -> {datas.add((char)data);});
////     								형변환 해줘야함
//     System.out.println(datas);
     
//     5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk")
//     ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//     datas.stream().map(String::toLowerCase).forEach(System.out::println);
//      				toLowerCase 라는 소문자로 변경해 주는 메소드
     
//     1~100까지 중 짝수만 ArrayList에 담고 출력
//     ArrayList<Integer> datas = new ArrayList<Integer>();
//     IntStream.rangeClosed(1, 100).filter((data) -> data % 2 == 0).forEach(datas::add);
//     System.out.println(datas);
     
//     "Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
//     ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//     datas.stream().filter((data) -> data.charAt(0) >= 'A')
//        .filter((data) -> data.charAt(0) <= 'Z')
////        .으로 이어나갈수 있으며 두개의 filter 선언 가능, 관계 연산( && , || )  X
//           .forEach(System.out::println);
     
     
//     한글을 정수로 변경
//     String hangle = "공일이삼사오육칠팔구";
//     String input = "일공이사";
//     input.chars().map(hangle::indexOf).forEach(System.out::println);
////						indexOf메서드 사용
     
//     정수를 한글로 변경
//     String hangle = "공일이삼사오육칠팔구";
//     String input = "1024";
//     input.chars().map((c) -> c - 48).forEach((i) -> System.out.println(hangle.charAt(i)));
     					
	   
	   
   }
}
