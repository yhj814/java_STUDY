package wrapperTest;

public class WrapperTask {
	//1, 3.56, 'A', false, "ABC"
	//위의 5개 값을 하나의 배열에 모두 담는다
	public static void main(String[] args) {
		
		Object []arObject= {1, 3.56, 'A', false, "ABC"};
		//object 는 상위 클래스니까 모든 것들을 배열에 담을 수 있다 업케스팅
		for(int i=0; i<arObject.length;i++) {
			System.out.println(arObject[i]);
		}
	}
}
