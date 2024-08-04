package list.task.shoes;

import java.util.ArrayList;

public class Page {
	public static void main(String[] args) {
		//신발 추가
		Shoes 에어포스 = new Shoes("에어포스","흰색","나이키",80_000);
		Shoes 삼바 = new Shoes("삼바","검은색","아디다스",85_000);
		Shoes 젤카야노 = new Shoes("젤카야노","회색","아식스",100_000);
		Shoes 올드스쿨 = new Shoes("올드스쿨","노란색","반스",70_000);
		
		Market market =new Market();
		ArrayList<Shoes> shoes =null;
		ArrayList<Shoes> product=DBConnecterShoes.shoes;
		
		System.out.println("신발 매장에 오신걸 환영합니다");
		if(market.checkShoesName(에어포스.getName())==null) {
			market.add(에어포스);
		}
		if(market.checkShoesName(삼바.getName())==null) {
			market.add(삼바);
		}
		if(market.checkShoesName(젤카야노.getName())==null) {
			market.add(젤카야노);
		}
		if(market.checkShoesName(올드스쿨.getName())==null) {
			market.add(올드스쿨);
		}
		
		//전체상품 조회
		System.out.println("★★★상품들★★★");
		shoes =market.findAll();
		System.out.println(shoes);
		
		
		//상품 가격 수정
		System.out.println("올드스쿨 가격이 수정되었습니다.");
		Shoes shoesPrice =market.checkShoesName("올드스쿨");
		if(shoesPrice != null) {
			shoesPrice.setPrice(75_000);
			market.update(shoesPrice);
		}
		System.out.println(product);
		
		//상품 색상 수정
		System.out.println("에어포스의 색상이 수정 되었습니다");
		Shoes shoesColor =market.checkShoesName("에어포스");
		if(shoesColor != null) {
			shoesColor.setColor("된장색");
			market.update(shoesColor);
		}
		System.out.println(product);
		
		//상품 삭제
		System.out.println("에어포스가 품절 되었습니다");
		market.remove(에어포스);
		shoes =market.findAll();
		
		//수정후 메뉴 목록
		System.out.println("상품들 수정후 목록입니다");
		System.out.println(market.findAll());
		
		//신발 이름으로 신발 종류 찾기
		System.out.print("삼바의 종류는 : ");
		Shoes shoesKind =market.checkShoesName("삼바");
		//신발클래스에 객체 설정 마켓클래스안에 있는 checkShoesName 메소드 불러오기
		System.out.println(shoesKind.getKind());
						//객체안에 있는 값 꺼내오기				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
