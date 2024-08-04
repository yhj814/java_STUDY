package methodTest;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTask {
//   1. 1 ~ 10까지 println()으로 출력하는 메소드
	void printFrom1To10() {
		// return으로 돌려줄 것이 없으므로 타입명 void
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
			// 1부터 출력하기위해 i + 1 해줌
		}
	}

//   2."홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int count) {
		// return으로 돌려줄 것이 없으므로 타입명 void, 아래 메인메서드에서 10을 받아 count에 저장 ,정수를 받았기때문에 int타입
		for (int i = 0; i < count; i++) {
			System.out.println("홍길동");
			// count를 10으로 받았기 때문에 10번 반복하여 홍길동 10번 출력
		}
	}

//   3.이름을 n번 println()으로 출력하는 메소드
	void printName(String name, int count) {
		// return 해줄 값이 없으므로 타입명 void 아래에서 문자열과 정수형 값 입력 받았기 때문에 타입명 String,int 설정
		for (int i = 0; i < count; i++) {
			System.out.println(name);
			// 이름을 n번 출력하는 것 이기때문에 count로 값을 받았고 반복문을 돌려 받은 이름을 출력
		}
	}

//   4.세 정수의 뺄셈 메소드
	int subtract(int number1, int number2, int number3) {
		// return 으로 돌려줄 값이 있으므로 메서드 앞에 타입 설정 정수로 값을 돌려줘야하기때문에 int타입 ,세 정수의 뺄셈이므로 세 정수를
		// 받아줌
		return number1 - number2 - number3;
		// 세 정수의 뺼셈식을 돌려줌
	}

//   5.두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   return 값은 반드시 1개만 가능하다.
	// 반환할 값이 두개 이상이면 무조건 배열써야한다
	int[] divide(int number1, int number2) {
		int[] result = null;
		// result 배열값 초기화
		if (number2 != 0) {
			// 첫번째 방법
			result = new int[] { number1 / number2, number1 % number2 };
			// 배열 0번방에 두 정수의 몫, 1번방에 두 정수의 나머지를 result에 저장

			// 두번째 방법(이게 좀 쉬움)
//         result = new int[2];
//         result[0] = number1 / number2;
//         result[1] = number1 % number2;
			// 위에거를 풀어쓴거임
		}
		return result;
		// result 를 메인메소드에 반환
	}

//	  6.성과 이름 두개를 받은 뒤
//    성과 이름을 그대로 리턴한다
	// 반환 받아야하는 값이 두개이므로 이것도 배열 대신 문자열이기 때문에 로 메인에서도 문자열로 반환
	String[] name(String firstName, String lastName) {
		// name이라는 메서드 안에 성과 이름을 문자열 타입으로 넣고 반환값 두개 이므로 문자열배열 사용
		String[] fullName = { firstName, lastName };
		// fullName이라는 배열안에 메인메소드에서 입력받은 갑을 배열에 저장
		return fullName;
		// fullName 배열 반환 값을 받았기때문에 return 사용
	}

//		7. 1~n 까지의 합을 구해주는 메소드
	int sum(int data) {
		// sum이라는 메서드 이름 정한 후 메인메소드에서 값을 받은것을 data라고 함 정수받아서 int형임
		int hap = 0;
		// 합을 저장할 변수
		for (int i = 0; i < data; i++) {
			// 메인메서드에서 준 값 만큼 반복
			hap += i + 1;
			// 값을 hap에 저장 + 1 한이유는 1부터 저장되게 하려고 한거
		}
		return hap;
		// 합을 받은 hap을 메인 메소드에 반환
	}

//		8.홀수를 짝수로 짝수를 홀수로 바꿔주는 메소드
	int change(int data) {
		// 메소드이름 정하고 메인메서드에서 입력받은값 정수 이므로 메소드 타입도 정수
		return ++data;
		// 입력받은 값을 1더해주고 반환하면 홀->짝, 짝->홀이 됨
	}

//   	9.문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//			메소드안에서 입력 받기 X
	String alphaChange(String data) {
		String result = "";
		for (int i = 0; i < data.length(); i++) {
			// 입력한 데이터의 길이 만큼 반복
			char ch = data.charAt(i);
			// 입력한 데이터를 i 수의 맞게 문자 ch 에 저장
			if (ch >= 97 && ch <= 122) { // 소문자 검사
				// 아스키 코드 a~z가 97부터 122
				result += (char) (ch - 32);
				// 97-32=65 즉 아스키코드로 65는 대문자 A이다, 소문자를 대문자로 바꾼다는 코드
			} else if (ch >= 65 && ch <= 90) { // 대문자 검사
				// 아스키코드로 65~90은 A~Z
				result += (char) (ch + 32);
				// 32를 더하면 97즉 소문자 a이다, 대문자를 소문자로 바꾼다는 코드
			} else {
				result += ch;
				// 알파벳을 입력하지 않은것, 즉 문자들 !@#$%^... 등 ch에 맞지 않는 값은 그대로 출력 즉, 문자들은 그대로 출력됨
			}
		}
		return result;
	}

//		10. 한글을 정수로 바꿔주는 메소드 (일공이사-> 1024)
	int changeHangle(String data) {
		String temp = "";
		String hangle = "공일이삼사오육칠팔구";
		int result = 0;

		for (int i = 0; i < data.length(); i++) {
			temp += hangle.indexOf(data.charAt(i));
			// 공일 을 입력하면 data에 입력된 길이 2만큼 반복하여 hangle.indexOf 즉 01자리에 data.charAt(i)의 문자를 찾아
			// temp에 저장
		}

		result = Integer.parseInt(temp);
		// temp의 값을 정수로 변환해서 result문자열에 저장

		return result;
	}

	// 11. 정수를 한글로 바꿔주는 메소드
	String changeInt(int number) {
		String result = "";
		String hangle = "공일이삼사오육칠팔구";
		while (number != 0) {
			// 입력받은 정수가 0이 아닐때가지 반복
			result = hangle.charAt(number % 10) + result;
			// hangle 은 문자열이기 때문에 1을 입력받았을때 10을 나눈 나머지는 1 이고 result 문자열이기때문에 값+문자열=문자열을 이용해
			// result에 문자열으로 자장됨
			number /= 10;
			// while문을 벗나기위해 일부러 몫을 0으로 만듦 이거 없으면 무한 반복
		}

		System.out.println(result);
		return hangle;
	}

	// 12. 5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드

//  int[] getMaxAndMin(int number1, int number2, int number3, int number4, int number5) {
//  int[] arData = {number1, number2, number3, number4, number5};
	//아래 방법을 풀어 쓴것이 위에 결과이다
	int[] getMaxAndMin(int[] arData) {
		int[] result = new int[2];
		//이 메서드 안에서 새로 만든 배열
		result[0] = arData[0];
		result[1] = arData[0];
		//최대 최소값 비교하기 위해 0을 두 방에 넣어줌
		for (int i = 1; i < arData.length; i++) {
			if (result[0] < arData[i]) {
				result[0] = arData[i];
			}
			//최대값 비교
			if (result[1] > arData[i]) {
				result[1] = arData[i];
			}
		}
		//최소값 비교
		return result;
		//배열값을 반환 그래서 메인에서 배열형으로 받아아함 
	}

//12번 upgrade: 리턴타입은 void로 하되, 사용하는 부분에서 결과를 쓸 수 있어야 한다(주소를 활용!).
	void getMaxAndMinUp(int[] arData, int[] result) {
		//메인 메소드에서 만든 배열의 주소를 보내줬기 때문에 반환할 값 없이 void 타입 사용가능
		result[0] = arData[0];
		result[1] = arData[0];
		//최소 최대값구하기 위해 0값을 다 넣어놈
		for (int i = 1; i < arData.length; i++) {
			if (result[0] < arData[i]) {
				result[0] = arData[i];
			}
			//최대값 비교
			if (result[1] > arData[i]) {
				result[1] = arData[i];
			}
			//최소값비교
			//끝나면 위에서 주소만줬기때문에 자동으로 반환
		}
	}

	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
		// MethodTask 클래스를 쓰기위해 사용하는 코드 , 쓸떄 변수.메서드()쓰면됨 ()안에는 값
		
		// 1번
//      methodTask.printFrom1To10();
		// methodTask변수의 printFromTo10() 이라는 메서드를 불러옴

		
		// 2번
//      methodTask.printHong(10);
		// methodTask변수의 printHong() 메서드를 불러오고 값은 10을 넣어줌

		
		// 3번
//      methodTask.printName("용호중", 5);
		// methodTask변수의 printName() 메서드를 불러오고 값을 문자열 용호중과 정수형 5를 두개 넣어줌

		
		// 4번
//      int result = methodTask.subtract(3, 2, 1);
//      //return 받을 변수를 지정해주고 result에 넣어줄 methodTask.subtract() 을 해준후 세 정수를 입력
//      System.out.println(result);
//      //그후 return 받은 값을 출력   

		
		// 5번
//      int[] result = methodTask.divide(10, 3);
//      //위에 메서드에서 배열로 값을 줬기때문에 result를 배열로 하고 divide라는 메서드에 10,3값을 주고 그 결과를 result []에 반환받음
//      String resultMessage = null;
//      //결과 메세지 출력, 메세지를 비워놔야 결과메세지 값이 들어감
//      if(result == null) {
//         resultMessage = "0 으로 나눌 수 없습니다.";
//      }else {
//         resultMessage = "몫: " + result[0] + "\n나머지: " + result[1];
//         //결과값 확인하기
//      }
//      System.out.println(resultMessage);
//      //결과메세지 출력

		
		// 6번
//      System.out.print(methodTask.name("용","호중")[0]);
//      //name이라는 메서드에 값을 "용","호중"을 준후 name메서드를 돌고 0번방만 출력 즉 성 출력
//      System.out.println(methodTask.name("용","호중")[1]);
//      //name이라는 메서드에 값을 "용","호중"을 준후 name메서드를 돌고 1번방만 출력 즉 이름 출력

		
		// 7번
//      int result= methodTask.sum(4);
//      //반환받는 값 정수형 sum이라는 메소드에 4값을 줌 즉 sum 메소드 sum(data) 값이 5가 되는거임
//      System.out.println(result);

		
//		8번
//      int result=methodTask.change(5);
//      //change 라는 메서드에 5값을 줌 그 change 메소드를 돌고 나온 값을 result에 저장 return 받은 값이 정수형이므로 result도 정수형
//      String mesg="로 바뀌었습니다";
//      String temp =result%2==0?"짝수":"홀수";
//      //result 값을 2로 나눈 나머지가 0 이면 참 즉 짝수 0이아니면 홀수 가 되므로 삼항연산으로 작성(if)문이 한개일때는 삼항연산사용
//      //참 거짓 값을 문자열에 저장해야하므로 temp는 문자열 타입
//      System.out.println(temp+mesg);
//      //결과값과 메세지 출력 문자열로 나옴 

		
//		9번
//      	String result="";
//      	String message = "영어로 문장을 입력해주세요";
//      	System.out.println(message);
//      	
//      	Scanner sc=new Scanner(System.in);
//      	
//      	String alpha=sc.nextLine();
//      	
//      	result=methodTask.alphaChange(alpha);
//      	System.out.println(result);

		
//		10번
//		int result = 0;
//
//		String message = "한글을 정수로 변환 : ";
//		System.out.println(message);
//
//		Scanner sc = new Scanner(System.in);
//
//		String hangle = sc.nextLine();
//
//		result = methodTask.changeHangle(hangle);
//
//		System.out.println(result);

		
//		// 11번
//		String message = "정수를 한글로 변환 : ";
//		System.out.println(message);
//		String result = "";
//
//		Scanner sc = new Scanner(System.in);
//
//		int num = sc.nextInt();
//
//		result = methodTask.changeInt(num);

		
		//12번
//		int[] arData = { 3, 5, 7, 2, 9 };
//		int result[] = methodTask.getMaxAndMin(arData);
		//arData주소를 보내 getMaxAndMin 메소드에서 실행후 return 값이 배열이므로 result[]로 받음
//		System.out.println("최대값 : "+result[0]);
//		System.out.println("최소값 : "+result[1]);
		
		
		//12번 upgrade
		int[] arData = { 3, 5, 7, 2, 9 };
		int[] result = new int[2];

		methodTask.getMaxAndMinUp(arData, result);
		//return 값 없이 주소를 보내면 return 필요없이 출력받을수 있다
		System.out.println(result[0]);
		//최대값
		System.out.println(result[1]);
		//최소값
	}

}
