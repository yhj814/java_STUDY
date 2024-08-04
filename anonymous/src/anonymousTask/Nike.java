package anonymousTask;

public class Nike {
	public void register(NikeForm nikeForm) {
		String[] menu = nikeForm.getMenu();

		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		if (nikeForm instanceof NikeFormAdapter) {
			System.out.println("$0 무료나눔 행사중 0$");
		} 
		
		else {
			nikeForm.sell("에어포스");
			nikeForm.soldOut("조던");
		}
	}
}
