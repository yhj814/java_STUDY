package job;

import java.util.Random;

public class ZooKeeper {
	String name;
	int successEatCount;
	int failEatCount;
	int money;
	int rating;
	int rank;

	public ZooKeeper(String name, int money, int rating, int rank) {
		this.name = name;
		this.money = money;
		this.rating = rating;
		this.rank = rank;
	}

	boolean feed() {
		Random random = new Random();
		int[] arData = new int[10];
		int randomIndex = 0;

		for (int i = 0; i < rating / 10; i++) {
			arData[i] = 1;
			// 배열에 1을 넣어줌
		}

		randomIndex = random.nextInt(arData.length);
		//1을 10칸 배열에 6개 넣어준거임 랜덤으로
		if (arData[randomIndex] == 1) {
			// 인덱스 값이 1이 나오면 true를 반환
			return true;
		}

		return false;
		//0이 나오면 false 반환
	}

	void zooKeeperInfo() {
		String infoMessage = "이름: " + this.name + "\n" + "성공 횟수: " + this.successEatCount + "번\n" + "실패 횟수: "
				+ this.failEatCount + "번\n" + "현재 잔액: " + this.money + "원";
		System.out.println(infoMessage);
	}

}
