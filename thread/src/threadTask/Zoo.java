package threadTask;

public class Zoo {
	public static void main(String[] args) {
		System.out.println("☞☞ 동석이네 동물원에 오신걸 환영합니다 ☜☜");
		ThreadTask mouse = new ThreadTask(" 찍찍!! ", "쥐 ");
		ThreadTask dog = new ThreadTask(" 멍멍! ", "강아지 ");
		ThreadTask cat = new ThreadTask(" 미야옹~ ", "고양이 ");

		Thread mouseThread = new Thread(mouse);
		Thread dogThread = new Thread(dog);
		Thread catThread = new Thread(cat);

		dogThread.start();
		catThread.start();

		try {
			dogThread.join();
			catThread.join();
		} catch (InterruptedException e) {;}
		
		mouseThread.start();
		System.out.println("나머지 한마리 동물 울기");
		
		try {
			mouseThread.join();
		} catch (InterruptedException e) {;}

	}
}
