package list.task.health;

import java.util.ArrayList;

public class page {
	public static void main(String[] args) {
		Health chest =new Health("벤치프레스",5,"가슴");
		Health back =new Health("렛풀다운",12,"등");
		Health shoulder =new Health("밀리터리프레스",8,"어깨");
		Health shoulder_1 =new Health("숄더프레스",10,"어깨");
		String targetMessage="의 타켓부위는 ";
		
		Gym gym = new Gym();
		ArrayList<Health> healths = null;
		
		if(gym.checkHealthName("벤치프레스")==null) {
			gym.add(chest);
		}
		if(gym.checkHealthName("렛풀다운")==null) {
			gym.add(back);
		}
		if(gym.checkHealthName("밀리터리프레스")==null) {
			gym.add(shoulder);
		}
		if(gym.checkHealthName("숄더프레스")==null) {
			gym.add(shoulder);
		}
		
		
		
		//넣은 값 출력
		System.out.println(DBConnecterHealth.healths);
		
		//등부위의 운동 출력
		System.out.println(back.getName());
		
		//렛풀다운의 타켓부위 출력
		System.out.println(back.getName()+targetMessage+
				gym.checkHealthName("렛풀다운").getKind());
		
		//전체 종목 출력
		healths= gym.selectAll();
		System.out.println("\n헬스장");
		System.out.println(healths);
		
		
		
		
		
		
		
		
		
		
		
	}
}
