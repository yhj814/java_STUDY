package controlStatementTest;

import java.util.Scanner;

public class WhileTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String title = "Q. 당신이 좋아하는 색을 선택하세요.";
    String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
    int choice = 0;
    String redMessage = "불같고 열정적이고 적극적이다.";
    String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
    String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
    String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
    String errorMessage = "잘못 입력하셨습니다.";
    String resultMessage = null;
    
    while(true) {
    	//무한반복
       System.out.println(title);
       System.out.println(menu);
       
       choice = sc.nextInt();
       
       if(choice == 5) {
          break;
          //목록에 없는 5가 되면 출력 단, 여기서 break는 무조건 스위치 문 밖에 있어야함
       }
 
       switch (choice) {
       case 1 -> resultMessage = redMessage;
       case 2 -> resultMessage = yellowMessage;
       case 3 -> resultMessage = blackMessage;
       case 4 -> resultMessage = whiteMessage;
       //스위치 문안에 break가 있으면 그냥 이 스위치문만 탈출하는거지 아에 프로그램 탈출이 아님
       default -> resultMessage = errorMessage;
       }
 
       System.out.println(resultMessage);
    }

}
}
