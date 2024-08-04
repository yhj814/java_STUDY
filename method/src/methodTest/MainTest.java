package methodTest;

public class MainTest {
//  javac 명령어로 .java파일 실행
//  javac MainTest.java
//  java methodTest.MainTest 값1 값2 값3, ...
  
//  main 메소드의 매개변수는 외부에서 전달될 다양한 정보를 받기 위해 존재한다.
//  java 명령어로 실행할 때, 문자열을 같이 전달해주면 args 문자열 배열의 각 방에 저장된다.
  public static void main(String[] args) {
     if(args.length != 0) {
    	 //arg길이가 0이아니라면 
        for (int i = 0; i < args.length; i++) {
           System.out.println(args[i]);
           //길이만큼 출력
        }
     }else {
        System.out.println("None");
        //길이가 0이면 None 출력  arg의 길이는 0이다 즉 초기값이다
     }
  }
}

