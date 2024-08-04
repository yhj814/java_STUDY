package opertest;

public class Opertest6 {
	public static void main(String[] args) {
//      1 ~ 10까지 중 4까지만 출력한다.
//      for (int i = 0; i < 10; i++) {
//         System.out.println(i + 1);
//
//         if(i == 3) {
//            break;
//         }
//      }

//      1 ~ 10까지 중 4를 제외하고 출력한다.
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
				//일단 들어온 조건문까지는 출력 하고 그 다음 출력문을 넘어간후 다시 반복문으로감 
			}

			System.out.println(i + 1);
		}
	}
}
