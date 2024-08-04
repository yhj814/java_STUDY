package job;

import java.util.Scanner;

public class Myjob {
	// 사육사
	/*
	 * 호랑이 먹이주기
	 * 1번 먹이주기 
	 * 2번 정보 확인하기 
	 * 3번 게임 종료
	 * 
	 * 1회 성공시 아기->어른 획득돈 50만원
	 * 2회 성공시 아기->어른 획득돈 50만원
	 * 3회 성공시 어른->야생 획득돈 100만원
	 * 야생으로 가고, 실패하면 어른으로 다시돌아갈수 없으므로 새로운 호랑이키우기로 바뀜 (즉 야생성공->아기호랑이)
	 * 1회 실패시 가진돈 50% 잃기 
	 * 2회 실패시 가진돈 75% 잃기 + 처음으로 돌아감, 어른에서 실패 -> 아기 , 야생에서 실패 -> 아기
	 */  

	public static void main(String[] args) {
		String title = "@@@@ 호랑이 먹이주기 게임 @@@@";
		String message = "1. 먹이주기\n2. 정보확인 \n3. 종료";
		Scanner sc = new Scanner(System.in);
		String[] arRank = { "아기호랑이", "어른호랑이", "야생으로" };
		ZooKeeper hojung = new ZooKeeper("Hojung", 0, 60, 0);
										//이름     성공수 확률 실패수
		int choice = 0;
		int successEatCount = 0, failEatCount = 0;

		while (true) {
			System.out.println(title);
			System.out.println(message);
			choice = sc.nextInt();

			if (choice == 3) {
				System.out.println("@@@@ 게임종료 @@@@");
				break;
				//3입력시 게임종료
			}

			switch (choice) {
			case 1:
				if (hojung.feed()) {
					hojung.money += 500_000;
					hojung.successEatCount++;
					//먹이주기 성공시 정보확인에서 성공값 증가
					successEatCount++;
					failEatCount = 0;

					System.out.println("★☆★☆★☆★☆★☆먹이주기 성공!!★☆★☆★☆★☆★☆");
					System.out.println("현재 " + arRank[hojung.rank] +"(로) 연속 "+ successEatCount + "회 성공중!\n");
					if (successEatCount >= 2) {
						//성공횟수가 2이상이고
						if (hojung.rank < 2) {
							//랭크가 야생보다 낮으면
							hojung.rank++;
							//랭크 값 +1
							System.out.println("다음단계!!!! "+ arRank[hojung.rank]+ "(으)로 축하합니다!\n");
							if(hojung.rank==2) {
								//랭크가 야생이라면
								hojung.money += 500_000;
								//50만원더 얻기
								hojung.rank--;
								hojung.rank--;
								//랭크값을 2번 뺴주며 랭크를 아기로 변경 즉 야생에서 더 갈곳이 없기때문에 처음부터 다시키우는걸로 설정
								successEatCount=0;
								//처음부터 다시키우는 것이기때문에 성공값도 0으로 초기화
							}
						}
					}
					break;
				}
				hojung.money /= 2;
				//한번실패시 가진돈 50% 잃기
				hojung.failEatCount++;
				//먹이주기 실패시 정보확인에서 실패값 증가
				failEatCount++;
				successEatCount = 0;
				System.out.println("먹이주기 실패...");
				System.out.println("분발하세요!! 현재 연속 먹이주기 " + failEatCount + "회 실패중입니다!\n");
				if (failEatCount >= 2) {
					System.out.println("다시키우기... ㅜㅡㅜ  \n");
					//먹이주기 2번 실패시 처음으로 돌아간다는 메세지 출력
					hojung.money/=2;
					//돈도 75%잃기 
					if (hojung.rank>0) {
						hojung.rank--;
						//랭크가 0보다 크면 랭크값 하나 감소 즉, 어른에서 2번실패하면 아기로 감 ,아기에서 두번실패하면 이 if문 에는 들어오지 않음
					}
				}
				break;
			case 2:
				hojung.zooKeeperInfo();
				//2번선택시 정보확인가능
				break;
			}
		}
	}
}
