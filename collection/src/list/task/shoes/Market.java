package list.task.shoes;

import java.util.ArrayList;

public class Market {
	// 신발 추가
	public void add(Shoes shoes) {
		DBConnecterShoes.shoes.add(shoes);
	}

	// 신발이름으로 신발 종류 조희
	public Shoes checkShoesName(String name) {
		ArrayList<Shoes> shoes = (ArrayList<Shoes>) DBConnecterShoes.shoes.clone();

		for (int i = 0; i < shoes.size(); i++) {
			if(shoes.get(i).getName().equals(name)) {
				return shoes.get(i);
			}
		}
		return null;
	}
	//신발 상품 수정 
	public void update(Shoes shoes) {
		int targetIndex = DBConnecterShoes.shoes.indexOf(shoes);
		DBConnecterShoes.shoes.set(targetIndex, shoes);
	}
	//신발 삭제
	public void remove(Shoes shoes) {
		DBConnecterShoes.shoes.remove(shoes);
	}
	//신발 전체 조회
	public ArrayList<Shoes> findAll(){
		return (ArrayList<Shoes>) DBConnecterShoes.shoes.clone();
	}
	
}
