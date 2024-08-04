package set.test;

import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> bloodTypeSet = new HashSet<String>();
		
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("O");
		bloodTypeSet.add("O");
		bloodTypeSet.add("O");
		//set으로 중복검사할수 있음  
		
		System.out.println(bloodTypeSet.toString());
		System.out.println(bloodTypeSet.size());
		System.out.println(bloodTypeSet.contains("C"));
	}
}
