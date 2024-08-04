package list.task.health;

import java.util.ArrayList;

public class Gym {
	public void add(Health health) {
		DBConnecterHealth.healths.add(health);
	}
	
	public Health checkHealthName(String name) {
		ArrayList<Health> healths = (ArrayList<Health>) DBConnecterHealth.healths.clone();
		
		for(int i =0; i<healths.size();i++) {
			if(healths.get(i).getName().equals(name)) {
				return healths.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Health> selectAll(){
		ArrayList<Health> health =new ArrayList<Health>();
		
		for(int i=0; i<DBConnecterHealth.healths.size();i++) {
			health.add(new Health(DBConnecterHealth.healths.get(i)));
		}
		return health;
	}
	
	public ArrayList<Health> findByKind(String kind){
		ArrayList<Health> health =(ArrayList<Health>)DBConnecterHealth.healths.clone();
		ArrayList<Health> result = new ArrayList<Health>();
		
		for(int i=0; i<health.size();i++) {
			if(health.get(i).getKind().equals(kind)) {
				result.add(health.get(i));
			}
		}
		return result;
	}
}
