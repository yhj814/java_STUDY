package lambdaTask1;

import java.util.Scanner;

public class MyMath {
   
   public static Calc operate(String oper) {
      return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
      //문자열 oper에 + 가 있냐 			있으면 이 식을 			 없으먼 이 식을 받음
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
      String example = "예)9+7-5";
      String expression = null;
      //식
      String[] opers = null;
      
      String[] temp = null;
      
      int number1 = 0, number2 = 0;
      
      System.out.println(message);
      System.out.println(example);
      expression = sc.next();
      //전달받을식
      
      OperCheck operCheck = e -> {
         String result = "";
         for (int i = 0; i < e.length(); i++) {
        	 //전달받은식의 길이만큼 반복
            char c = e.charAt(i);
            //문자열 e로 받은 것을 문자로 c에 저장
            if(c == '+' || c == '-') {
            	// c에 + 가 있거나 -가 있으면
               result += c;
               //+와 -를 result 에 저장
            }
         }
         return result.split("");
         //+,-를 문자열로 묶어서 "+" "-" 로 저장
      };
      
      opers = operCheck.getOpers(expression);
      //전달 받은 expression식에서 +,-를 opers라는 문자열배열에 담고
      temp = expression.split("\\+|\\-");
      //+,- 를 뺸 수를 분리하여 문자열 temp에 하나하나씩 담는다
      number1 = Integer.parseInt(temp[0].equals("") ? opers[0] + temp[1] : temp[0]);
      //처음 받은 숫자가 +,- 면 앞 아니면 뒤에것을 첫숫자로 받는다
      for (int i = 0; i < opers.length; i++) {
    	  
//         아래의 조건식은 number1이 음수라면, 평생 음수이다.         
//         첫 번째 반복에서만 검사해야 한다!
         if(i == 0 && number1 < 0) {continue;}
         //그래서 continue 를 씀
         number2 = Integer.parseInt(temp[i + 1]);
         //두번째 숫자를 의미 
         number1 = MyMath.operate(opers[i]).calc(number1, number2);
      }
      
      System.out.println(number1);
   }
}


//
//[심화 실습]
//여러 개의 정수를 입력받아서 알맞는 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//
//입력 예1) 7 + 35 - 9
//출력 예1) 33
//
//입력 예2) -9 + 8 + 10
//출력 예2) 9
//
//* "ABC".split("")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   "A,B,C".split(",")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
//   구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
//   예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
//
//* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//
//* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작) - Calc
//
//* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//
//* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작) - OperCheck
//
//* main메소드에 getOpers를 람다식으로 구현 - MyMath(메인 메소드 선언)
//
//* 첫번째 정수가 음수일 경우 오류 해결
//
//Calc, OperCheck,MyMath(메인 메소드 선언)
