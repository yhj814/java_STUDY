package inputTest;
import java.util.Scanner;


public class InputTest1 {
	public static void main(String[] args) {
//		초기값 : 아직 어떤 값을 넣을 지 모를 때 넣는 값
//		정수 : 0
//		실수 : 0.0
//		문자 : ''
//		문자열 : null
		
		Scanner sc = new Scanner(System.in);
		String name=null; //초가화 시키기
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println(name + "님 환영합니다!!");
	}
}
