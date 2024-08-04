package set.test;

import java.util.HashSet;

public class SetTask {
	public static void main(String[] args) {
		//태극기 색깔
		//흰색, 검은색, 빨간색, 파란색
		
		HashSet<String> colorSet =new HashSet<String>();
		
		colorSet.add("흰색");
		colorSet.add("검은색");
		colorSet.add("파란색");
		colorSet.add("빨간색");
		
		System.out.println(colorSet.toString());
		if(colorSet.contains("녹색")) {
			System.out.println("녹색 있음");			
		}
		else {
			System.out.println("녹색 없음");
		}
	}
}
