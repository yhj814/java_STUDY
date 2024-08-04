package arrayTest;

import java.util.Scanner;

public class Team1Test {
	public static void main(String[] args) {
//	   용호중 문제 : 1부터 30까지 배열에 담은후 3의 배수의 합 출력

//		int[] arData = new int[30];
//		// 30개의 배열 만들기
//		int sum = 0;
//		// 3의 배수의 합을 저장해놀 sum 변수 초기화
//		for (int i = 0; i < arData.length; i++) {
//			// 만든 배열의 길이만큼 증가하게 반복문 작성
//			arData[i] = i + 1;
//			// 배열의 저장공간에 1부터 출력하기위해 1을 더해줌
//			if (arData[i] % 3 == 0) {
//				// 만약 저장공간에 들어있는 값이 3의 배수라면 즉 나눴을때 나머지가 0이라면
//				sum += arData[i];
//				// 3의 배수의 합을 저장해놓을 공간에 arData[i]값을 더해주며 저장한다
//			}
//		}
//		System.out.println(sum);
//		// 배열의 길이만큼 반복한 후 반복문을 빠져나오면 sum 값을 출력한다

//		오정록 문제 : int 1 ~ 100과, 알파벳 a~h 를 각각 다른 두 배열에 담은 후, 
//		담은 후 짝수의 합 출력. (알파벳의 경우 해당하는 아스키 값의 정수로 계산한다.)//a=97
		
//		int[] arData=new int[100];
//		
//		int sum=0;
//		int sum1=0;
//		int result=0;
//		
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=i+1;
//			if(arData[i]%2==0) {
//				sum+=arData[i];
//			}
//		}
//		System.out.println("1~100까지의 짝수합 "+sum);
//		
//		char[] alpha=new char[8];
//		
//		for(int i=0;i<alpha.length;i++) {
//			alpha[i]=(char)(97+i); 
//			int asci = (int)alpha[i];
//			if(asci%2==0) {
//				sum1+=asci;
//			}
//		}
//		System.out.println("a~h의 아스키코드 짝수합 "+ sum1);
//		
//		result=sum+sum1;
//		System.out.println("두짝수의 합은 "+result);
		
//		안수진 문제: 사용자가 배열의 크기와 정수를 입력하면 그 배열을 역순으로 출력한다
		
		Scanner sc= new Scanner(System.in);
		
		String mesg="배열의 크기를 입력하세요";
		System.out.println(mesg);
		
		int arrayNum=sc.nextInt();
		
		int array[]=new int[arrayNum];
		
		String mesg1="만들어진 배열에 들어갈 정수를 입력하세요.";
		System.out.println(mesg1);
		
		for(int i=0; i<arrayNum ;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("입력한 정수의 역순은");
		
		for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


//		하민지 문제 : 배열을 aBcDeF..Z 순서로 출력하되, 사용자에게 칸수 입력받기.
		
//		Scanner sc= new Scanner(System.in);
//		
//	String mesg = "사용하실 칸수를 입력해주세요.";
//		System.out.println(mesg);
//		
//	int num=sc.nextInt();
//		
//		char[] array = new char[num];
//	      for (int i = 0; i < array.length; i++) {
//	          System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));         
//	         }      
//	      System.out.println(array);
	}
}







