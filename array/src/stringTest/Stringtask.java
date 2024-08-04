package stringTest;

import java.util.Scanner;

public class Stringtask {
	public static void main(String[] args) {
//      1.사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
//      
      String message = "영어로 문장을 입력해주세요";
      Scanner sc = new Scanner(System.in);
      //입력하기
      String data = null;
      //입력받을 문자열 초기화
      String result = "";
      //결과값 문자열로 생성
      System.out.println(message);
      data = sc.nextLine();
      //입력한값 data 에 저장
      for (int i = 0; i < data.length(); i++) {
    	  //입력한 데이터의 길이 만큼 반복
         char ch = data.charAt(i);
         //입력한 데이터를 i 수의 맞게 문자 ch 에 저장
         if(ch >= 97 && ch <= 122) { // 소문자 검사
        	//아스키 코드 a~z가 97부터 122
            result += (char)(ch - 32);
            //97-32=65 즉 아스키코드로 65는 대문자 A이다, 소문자를 대문자로 바꾼다는 코드
         }
         else if(ch >= 65 && ch <= 90) { // 대문자 검사
        	 //아스키코드로 65~90은 A~Z 
            result += (char)(ch + 32);
            //32를 더하면 97즉 소문자 a이다, 대문자를 소문자로 바꾼다는 코드 
         }else {
            result += ch;
            //알파벳을 입력하지 않은것, 즉 문자들 !@#$%^... 등 ch에 맞지 않는 값은 그대로 출력 즉, 문자들은 그대로 출력됨
         }
      }
      
      System.out.println(result);
      
//     2.정수를 한글로 변경한다.
//     입력 예) 1024
//     출력 예) 일공이사
//      String message = "정수 입력: ";
//      Scanner sc = new Scanner(System.in);
//      String data = null;
//      int number = 0;
//      String hangle = "공일이삼사오육칠팔구";
//      String result = "";
      //문자열임
           
//      System.out.println(message);
//      data = sc.next();
//      //입력받을 값
//      for (int i = 0; i < data.length(); i++) {
//         result += hangle.charAt(data.charAt(i) - 48);
//         //입력받은 값의 길이만큼 반복하고 정수로 입력받은 값을 48로 뺴주면 뺴는 이유는 아스키코드로 48이 0이기 떄문에
//         //.charAt()를 사용하여 0번째 자리 문자값으로 출력하기 위하여 즉 0을 입력하면 0번째 자리 공 을 출력하기 위해 뺴준다
//         }
//      
//      System.out.println(result);
      
      //방법 2
//      number = sc.nextInt();
//      System.out.println(message);
//      while(number != 0) {
//    	  //입력받은 정수가 0이 아닐때가지 반복
//         result = hangle.charAt(number % 10) + result;
//         //hangle 은 문자열이기 때문에 1을 입력받았을때 10을 나눈 나머지는 1 이고 result 문자열이기때문에 값+문자열=문자열을 이용해
//         //result에 문자열으로 자장됨
//         number /= 10;
//         //while문을 벗나기위해 일부러 몫을 0으로 만듦 이거 없으면 무한 반복
//      }
//      
//      System.out.println(result);
      
      
      
//     3.한글을 정수로 변경한다.
//       입력 예) 일공이사
//     	 출력 예) 1024
//      String hangle = "공일이삼사오육칠팔구";
//      String message = "정수를 한글로 입력: ";
//      Scanner sc = new Scanner(System.in);
//      String data = null;
//      String temp = "";
//      int result = 0;
//      
//      System.out.println(message);
//      data = sc.next();
//      
//      for (int i = 0; i < data.length(); i++) {
//         temp += hangle.indexOf(data.charAt(i));
//         //공일 을 입력하면 data에 입력된 길이 2만큼 반복하여 hangle.indexOf 즉 01자리에 data.charAt(i)의 문자를 찾아 temp에 저장
//         }
//      
//      result = Integer.parseInt(temp);
//      //temp의 값을 정수로 변환해서 result문자열에 저장
//      System.out.println(result);
      
//      아래의 주소에서 "/news"만 분리하여 출력한다.
//      www.naver.com/news
      
//      String data = "www.naver.com/news";
//      
//      int fromIndex = data.indexOf("/");
//      String result = data.substring(fromIndex);
//      //substring 이거는 /여기서부터 뺴고 출력하라
//      System.out.println(result);
	}
}
