package arrayTest;


public class Artest1 {
	public static void main(String[] args) {
		/*int[] arData = { 2, 4, 5, 6, 8 };
		
		System.out.println(arData);
		//주소
		System.out.println(arData[0]);
		//0번방의 값 즉 2
		System.out.println("===========");
		
		//첫번째 값부터 순서대로 출력
		for(int i=0;i<arData.length;i++) {
		//.length는 배열의 방 길이를 알려주는것
			System.out.print(arData[i]);
		}*/
		
//      선언 시, 어떤 값이 들어갈 지는 모르지만 5칸이 필요하다.
//      5, 4, 3, 2, 1을 각 방에 넣고 출력

		int [] arData= new int[5];
		
		for(int i=0; i<arData.length;i++) {
			arData[i]=5-i;
			//5부터 출력하기 위해 5-i 를 해줌
			System.out.println(arData[i]);
		}
		
		
	}
}
