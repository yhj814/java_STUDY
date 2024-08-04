package inputTest;

import java.util.Scanner;

public class InputTest2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		1.입력받을 클래스를 적는다 (선언문)
		String message = "두 정수를 입력해주세요.";
//		2.입력받을 메세지를 적는다
	      
	      String data1 = null, data2 = null;
	      int number1 = 0, number2 = 0, result = 0;
//		3.초기변수들을 초기화 해준다
	      
	      
	      System.out.println(message);
//		4.입력받을 메세지를 출력한다
	      
	      data1 = sc.next();
	      data2 = sc.next();
//		5.입력받을 데이터를 입력한다
	      
	      number1 = Integer.parseInt(data1);
	      number2 = Integer.parseInt(data2);
//		6.입력받은 데이터가 정수형이 되게 바꿔준다
	      
	      result = number1 * number2;
//		7.입력받은 데이터를 출력하기 위해 출력값을 설정해준다
	      System.out.print(result);
//		8.출력값을 출력한다
	   }

	}

