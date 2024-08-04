package anonymousTask;

public class BuildingNike {
	public static void main(String[] args) {
		Nike jamsil = new Nike();
		System.out.println("잠실점");
		jamsil.register(new NikeForm() {
							//익명클래스  

			@Override
			public void sell(String order) {
				//NikeForm에 있는 sell을 오버로딩
				String[] menu = getMenu();
				//메뉴불러 오기
				for (int i = 0; i < menu.length; i++) {
					//메뉴의 개수만큼 반복
					if (menu[i].equals(order)) {
						//메뉴마다 문자열 즉, 메뉴명이 일치하면
						System.out.println(order + " 판매중");
						//즉 0번 메뉴는 에어포스 이므로 에어포스 판매중
					}
				}
			}
			
			@Override
			public void soldOut(String order) {
				String[] menu = getMenu();
				for (int i = 0; i < menu.length; i++) {
					if (menu[i].equals(order)) {
						System.out.println(order + " 품절\n");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				return new String[] { "에어포스", "조던", "러닝화", "에어맥스" };
			}
		});

		Nike gangnum = new Nike();
		System.out.println("강남점");
		gangnum.register(new NikeFormAdapter() {
			@Override
			public String[] getMenu() {
				return new String[] { "에어포스", "조던", "러닝화", "에어맥스" };
			}
		});
	}
}
