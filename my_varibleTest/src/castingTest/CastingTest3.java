package castingTest;
	
public class CastingTest3 {
	public static void main(String[] args) {
		System.out.println("" + 3);
		System.out.println("1" + 3 + 8);  // 문자열과 정수 더하면 문자열 (연결임)
		System.out.println("1" + (3 + 8)); //(괄호 떄문에 연산 먼저하고 문자열이랑 연결됨)
		
	}
}
