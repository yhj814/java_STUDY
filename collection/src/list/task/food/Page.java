package list.task.food;

import java.util.ArrayList;

public class Page {
	public static void main(String[] args) {
//      음식 추가
		Food 탕수육 = new Food("탕수육", 9000, "중식");
		Food 짜장면 = new Food("짜장면", 8000, "중식");
		Food 짬뽕 = new Food("짬뽕", 9500, "중식");
		Food 비빔밥 = new Food("비빔밥", 9900, "한식");
		Food 파스타 = new Food("파스타", 11000, "양식");
		Food 피자 = new Food("피자", 4500, "양식");

		Restaurant restaurant = new Restaurant();
		ArrayList<Food> foods = null;

		if (restaurant.checkFoodName("탕수육") == null) {
			restaurant.add(탕수육);
		}
		if (restaurant.checkFoodName("비빔밥") == null) {
			restaurant.add(비빔밥);
		}
		if (restaurant.checkFoodName("파스타") == null) {
			restaurant.add(파스타);
		}
		if (restaurant.checkFoodName("피자") == null) {
			restaurant.add(피자);
		}
		if (restaurant.checkFoodName("짜장면") == null) {
			restaurant.add(짜장면);
		}
		if (restaurant.checkFoodName("짬뽕") == null) {
			restaurant.add(짬뽕);
		}

		System.out.println(DBConnecterFood.foods);

		System.out.println("피자의 종류는 " + restaurant.checkFoodName("피자").getKind());

		foods = restaurant.selectAll();

//      foods.get(0).setName("짬뽕");
//      System.out.println(foods);
//      System.out.println(DBConnecter.foods);

		Food food = restaurant.checkFoodName("파스타");
		if (food != null) {
			System.out.println("파스타의 종류가 바뀌었습니다");
			food.setKind("한식");
			restaurant.update(food); // 수정 완료버튼을 눌렀을 때 실행되는 코드
		}

		System.out.println(DBConnecterFood.foods);

		System.out.println("중식 메뉴들");
		System.out.println(restaurant.findByKind("중식"));

	}
}
