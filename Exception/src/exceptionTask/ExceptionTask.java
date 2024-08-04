package exceptionTask;

import java.util.Scanner;

public class ExceptionTask {
//  캐릭터 이름을 입력받고, 
//  "멍청이", "바보", "똥개"가 포함된 이름은 
//  예외를 발생시켜 사용자에게 경고 메세지를 출력해준다.
//  ※ 강제 종료하지 않는다.

	public void chat(String message) {
//      equals(): 같을 때 true
//      contains(): 문장에 포함되어 있으면 true
		try {
			if (message.contains("멍청이")) {
				throw new BadWordTaskException();
			}
			if (message.contains("바보")) {
				throw new BadWordTaskException();
			}
			if (message.contains("똥개")) {
				throw new BadWordTaskException();
			}
		}catch (BadWordTaskException e) {
			message = "경고 나쁜말은 안돼요";
		}
		System.out.println(message);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExceptionTask chatting = new ExceptionTask();
		String message = "이름을 입력하세요 :";
		String data = null;

		while (true) {
			System.out.println(message);
			data = sc.nextLine();

			chatting.chat(data);
		}
	}
}

//package exceptionTask;
//
//import java.util.Scanner;
//
//public class ExceptionTask {
////   캐릭터 이름을 입력받고, 
////   "멍청이", "바보", "똥개"가 포함된 이름은 
////   예외를 발생시켜 사용자에게 경고 메세지를 출력해준다.
////   ※ 강제 종료하지 않는다.
//   
////   출력 예1 : 캐릭터명: 홍길동
////   출력 예2 : 사용할 수 없는 닉네임입니다.
//   
//   boolean checkNickname(String nickname) {
//      String[] arName = {"멍청이", "바보", "똥개"};
//      boolean nicknameFlag = false;
//      
//      for (int i = 0; i < arName.length; i++) {
//         if(nickname.contains(arName[i])) {
//            nicknameFlag = true;
//         }
//      }
//      
//      if(nicknameFlag) {
//         try {
//            throw new NicknameException("사용할 수 없는 닉네임입니다.");
//         } catch (NicknameException e) {
//            System.out.println("사용할 수 없는 닉네임입니다.");
//         }
//      }
//      return !nicknameFlag;
//   }
//   
//   
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      ExceptionTask exceptionTask = new ExceptionTask();
//      String message = "캐릭터명: ";
//      String nickname = null;
//      
//      System.out.print(message);
//      nickname = sc.next();
//      
//      if (exceptionTask.checkNickname(nickname)) {
//         System.out.println("캐릭터명: " + nickname);
//      }
//   }
//}

