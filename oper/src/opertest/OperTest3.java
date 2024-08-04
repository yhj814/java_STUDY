package opertest;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperTest3 {
   public static void main(String[] args) {
//      사용자에게 키를 입력받고 
//      정수라면 정수로 출력
//      실수라면 실수로 출력
//      예) 183 -> 183 출력
//          183.5 -> 183.5 출력
//	   		183.0 -> 180
//     		%.f, .length , parseDouble, 삼항연산 

	   Scanner sc = new Scanner(System.in);
	   double height = 0.0;
	   String message = "키: ", format = null;
	   boolean isInteger = false;
	   int length = 0;
	   BigDecimal originalHeight = null;  //실수의 오류를 확인하는 클래스 BigDeciaml
	   BigDecimal exp = null;
	      
	   System.out.print(message);
	   height = sc.nextDouble();
	   originalHeight = new BigDecimal(String.valueOf(height));
	   //더블형으로 입력받은 값을 다시 문자열로 바꿔주기
	   exp = new BigDecimal(String.valueOf((int)height));
	   isInteger =(height - (int)height) == 0;
	   //정수를 입력했을때 정수 - 정수 =0 이면 
	   length = originalHeight.subtract(exp).toString().length() - 2;
	   //정수를 입력했지만 더블로 바뀐거를 소수점과 뒤에 것을 버려줘라 
	 //length = (height - (int)height + "").length() - 2;
	   format = isInteger ? "%.0f" : "%." + length + "f";
	   //따라서 그 값이..어렵다
	   System.out.printf(format, height);

       
	   
   }
}