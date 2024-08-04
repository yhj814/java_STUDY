package inputTest;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		입력받을 클래스를 입력한다 (선언문)
	
		String mesg = "입력받을 세 정수를 입력하세요";
//		입력받을 메세지를 입력한다	
		
		System.out.println(mesg);
//		입력받은 메세지를 출력한다
		
		int dataNum1=0, dataNum2=0, dataNum3=0, result=0;
//		변수들을 초기화 한다
		
		dataNum1=sc.nextInt();
		dataNum2=sc.nextInt();
		dataNum3=sc.nextInt();
//		콘솔창에 입력받을 정수들을 입력하기 위해 nextInt()를 사용한다
		
		result=dataNum1+dataNum2+dataNum3;
//		결과값의 식을 세변수를 이용하여 식을 만들어 준다
		
		System.out.println("세 정수의 합 : "+ result);
//		결과값을 출력해 준다
	}
}
