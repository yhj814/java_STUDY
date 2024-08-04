package arrayTest;

public class ArrTest {
	public static void main(String[] args) {
		//2차원 : 행 열
		//3차원 : 면 행 열
		//4차원 : 의 면 행 열

		int[][] arrData= {
				{3,4,5},
				{7,8,9}
		};
//		int length=arrData.length*arrData[0].length;
//		//각 값을 순서대로 출력
//		for(int i=0; i<length;i++) {
//			System.out.print(arrData[i/3][i%3]);
//			if(i==2) {
			//행의 길이(length)가 2면
//				System.out.println();
//			}
//		}
		//for문 두개써서 풀기 (이거 쓰기)
		
	    for (int i = 0; i < arrData.length; i++) {
	    	//행부터 접근
	        for (int j = 0; j < arrData[i].length; j++) {
	        	//그 다음 열 접근
	           System.out.print(arrData[i][j]);
	        }
	        System.out.println();
	     }

	}
}
