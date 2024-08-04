package arrayTest;

import java.util.Scanner;

public class ArTask {
   public static void main(String[] args) {
//      브론즈
//      1 ~ 10까지 배열에 담고 출력
//      10번 반복하는 for문 만들기
//      int[] arData = new int[10];
//      arData라는 기억장소에 10개의 새로운 배열 만들기
//      for (int i = 0; i < 10; i++) {
//         arData[i] = i + 1;
	   	   //10개의 기억장소를 만든거임		   
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
	       //그후 기억장소에 담긴 값을 출력
//      }
      
      
//      10 ~ 1까지 중 짝수만 배열에 담고 출력
//      int[] arData = new int[5];
//	    //짝수만 배열에 담는거라 5개만 생성
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (5 - i) * 2;
//	   	   //10부터 역순으로 출력하기 위하여 5-i를 먼저해줌 그럼 arData[10]부터 8순으로 반복
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//         //10,8,6,4,2로 출력
//      }
      
      //1 ~ 100까지 배열에 담은 후 홀수만 출력
//      int[] arData = new int[100];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i;
//         //100개의 저장공간을 만들고 값을 넣음
//      }
      
//      for (int i = 0; i < arData.length; i++) {
//         if(arData[i] % 2 == 1) {
//        	 //저장된값의 나머지가 1일때 즉 홀수
//            System.out.println(arData[i]);
//            //홀수만 출력
//         }
//      }
      
//      for (int i = 0; i <50; i++) {
//         System.out.println(arData[i * 2]);
//      }//0~100에짝수만 출력되게 하는 거
//      
	   
//      실버
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//      int[] arData = new int[100];
//      int result = 0;
//      //짝수의 합을 저장할공간 초기화
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//         //1부터 100까지의 값을 arData[]에 담는다
//         if (arData[i] % 2 == 0) {
//            result += arData[i];
//            //저장된 값을 2로 나눴을 때 값(짝수)을 result 누적
//         }
//      }
//      
//      System.out.println(result);
//      //짝수의 총합을 출력
      
//      A ~ F까지 배열에 담고 출력
//      char[] arData = new char[6];
//      //A~F는 6개 이므로 6개
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(65 + i);
//         //65(A)부터 차례대로 70(F)까지 char 타입으로 저장
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
//      
//      A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//      char[] arData = new char[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//         //i가 1보다 크면 true 이므로 68출력 즉 67인(C)를 재외가된 채로 저장 
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//         // C 재외하고 출력됨 [0]=65, [1]=66, [2]=68, [3]=69, [4]=70
//      }
      
      
//     골드
	   
//     5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//     비교하기 위해서는 항이 2개가 필요하다.
     
//     Scanner sc = new Scanner(System.in);
//     int[] arData = new int[5];
//     String message = "5개의 정수를 입력하세요.\n예)1 3 2 4 6";
//     int max = 0, min = 0;
//     //최대값, 최소값 초기화
//     
//     System.out.println(message);
//     
//     for (int i = 0; i < arData.length; i++) {
//    	 //5개까지 입력한다
//        arData[i] = sc.nextInt();
//        //int 타입으로 받겠다
//     }
//     
//     max = arData[0];
//     min = arData[0];
//     //처음 입력받은 값이 최대값, 최소값이 될 수 있다
//     
//     for (int i = 1; i < arData.length; i++) {
//    	 //다음 입력 받은 값이랑 비교 해야 하기 때문에 int i=1
//        if(max < arData[i]) {
//           max = arData[i];
//        }
//        if(min > arData[i]) {
//           min = arData[i];
//           //입력한 값 5 6 4 7 3
//           /*[0]=5, [1]=6,인 상태에서 max if문 비교 성립 되므로 max가 6인상태
//           그대로 min if 문 내려옴 [0]=5, [1]=6 인 상태로 비교 성립 안됨
//           따라서 max= 6 min=5인상태 다음 포문 max=6, [2]=4 max if 문 비교
//           성립 안됨 min if 문 내려감 min은 5인 상태 [2]=4 성립됨 그럼 min=4인상태
//           이렇게 쭉 [4] 값까지 비교*/ 
//        }
//     }
//     
//     System.out.println("최대값: " + max);
//     System.out.println("최소값: " + min);
     //따라서 max = 7, min = 3이 나옴
     
     
//     다이아
//     사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//     입력한 정수들의 평균값을 구한다.
	   
//	   int[] arData = null;
//	   //사용자가 칸과 값을 모르기 때문에 null 로 처리
//	      Scanner sc = new Scanner(System.in);
//	      String message1 = "몇 개의 정수를 입력하시나요?";
//	      String message2 = "번 정수: ";
//	      //메세지 입력
//	      
//	      int size = 0, total = 0;
//	      //입력받을 칸수와 평균값 저장공간 초기화
//	      System.out.println(message1);
//	      size = sc.nextInt();
//	      //칸수 입력 
//	      
//	      arData = new int[size];
//	      //입력받은 칸수로 배열 만들기
//	      
//	      for (int i = 0; i < arData.length; i++) {
//	         System.out.print(i + 1 + message2);
//	         arData[i] = sc.nextInt();
//	         //배열의 길이 만큼 입력받은 값을 배열에 반복해 입력
//	      }
//	      
//	      for (int i = 0; i < arData.length; i++) {
//	         total += arData[i];
//	         //배열의 길이에 맞게 입력된 데이터를 더하면서 토탈변수에 저장
//	      }
//	      
//	      System.out.println((double)total / arData.length);
//	      // 토탈을 입력 받은 배열의 길이 만큼 나눈후 몫을 실수 값으로 출력한다
	}
}