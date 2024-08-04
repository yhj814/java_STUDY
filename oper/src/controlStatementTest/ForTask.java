package controlStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//      브론즈
		
/*      1 ~ 100까지 출력
		for(int i=0; i<100;i++) {
			System.out.println(i+1);
		}*/
		
		
/*      100 ~ 1까지 출력
		for(int i=0 ;i<100;i++) {
			System.out.println(100-i);
		}*/
		
		
//      1 ~ 100까지 중 짝수만 출력
//		for(int i=1;i<101;i+=2) {
//			System.out.println(i+1);
//		i가 1이고 100까지 일때 조건식이 맞다면 1을 더하고 올라가 i를 2씩 증가함
//		}
		
		
//      실버
		
//      1 ~ 10까지 합 출력
//		int sum=0;
//		합을 저장할변수
//		for(int i = 1; i < 11; i++) {
//			sum +=i;
//			i는 1이고 i가 11보다 작으면 sum에 값을 누적시킨후 i증가후 11보다 작을까지 누적시키면서 반복
//		}
//		System.out.println(sum);
//		//누적된 값을 출력
		
		
/*     1 ~ n까지 합 출력(n은 사용자에게 입력받는다)	
		
		int num=0;
		//입력받을 값
		int sum=0;
		//입력받은 값의 합을 저장할 공간
		String mesg="1부터 원하는 숫자를 입력하세요";
		System.out.println(mesg);
		
		Scanner sc=new Scanner(System.in);
		
		num=sc.nextInt();
		//값은 정수형으로 받겠다
		for(int i=1;i<=num;i++) {
			sum+=i;
			//1부터 입력받은 값까지를 sum에 누적
		}
		System.out.println("1부터 "+num+" 까지의 합은 "+sum+" 입니다");*/
		
//      골드
		
//      A ~ F까지 출력
		//char타입도 됌 
//		for(char i ='A';i<'G';i++) {
//			System.out.print(" "+i);
//		}
		
/*      A ~ F까지 중 C 제외하고 출력(continue 사용하지 않기)
		//아스키코드 사용해서 A는 65, a는 97임
		 for (int i = 0; i < 5; i++) {
	         System.out.println((char)(i > 1 ? i + 66 : i + 65));
	         //i가 1보다 크면 68 즉, 67을 생략하고 그다음꺼부터 출력 따라서 C는 제외되고 출력
	      */
	
//      다이아
		
//     0 1 2 3 0 1 2 3 0 1 2 3 출력
//		0 1 2 3 4 5 6 7 8 9 10 11이라고 i값을 두고 4를 나눈 나머지가 위에 값이므로 맞게 출력됨
//		for(int i=0;i<12;i++) {
//			System.out.print(i%4+" ");
//		}
	
		
//      aBcDeFgH...Z 출력
//      알파벳은 총 26개	
		//A=65 아스키코드
		//a=97 아스키코드
//		for(int i=0;i<26;i++) {
//			System.out.print((char)(i%2==0 ? i+97 : i+65));
			//아스키코드 이용하여 나머지값이 0이면 97(소문자 a), 0이아니면 대문자로 출력 
//		}
		
	}
}
