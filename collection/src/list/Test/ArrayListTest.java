package list.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		// <?> : 제네릭(이름이 없는)
		// 객체화 시 타입을 지정하는 기법
		// 자료구조를 설계할때 데이터의 타입을 지정할 수 없기 떄문에 임시로 타입을 선언한다.
		// 따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object가 아닌 제네릭으로 선언한다.

		ArrayList<Integer> datas = new ArrayList<Integer>();
		// 클래스 자료형 객체
		// datas.add(10);
		// 정수형 자료 리스트에 10을 추가
		datas.add(10);
		datas.add(20);
		datas.add(30);
		datas.add(40);
		datas.add(50);
		datas.add(60);
		datas.add(70);
		datas.add(80);
		datas.add(90);

		System.out.println("담겨진 데이터 보기");
		System.out.println(datas+"\n");
		// 뒤에 .toString 생략
		
		System.out.println("담겨진 데이터 개수");
		System.out.println(datas.size()+"\n");
		// 담겨진 데이터 개수

		// 정렬 .sort
		System.out.println("Collections. 으로 정렬");
		Collections.sort(datas);
		System.out.println(datas+"\n");

		// 가운데를 기준으로 좌우 바꾸기 .reverse
		System.out.println("Collections. 으로 가운데를 기준으로 좌우 바꾸기");
		Collections.reverse(datas);
		System.out.println(datas+"\n");

		// 섞기 .shuffle
		System.out.println("Collections. 으로 섞기");
		Collections.shuffle(datas);
		System.out.println(datas+"\n");

		// 추가 삽입 (60은 항상 30뒤에 삽입된다)
		System.out.println("추가 삽입 (60은 항상 30뒤에 삽입된다)");
		if (datas.contains(30)) {
			datas.add(datas.indexOf(30) + 1, 60);
			// 30이 위치한 인덱스 다음 인덱스에 60을 넣어라
			System.out.println(datas+"\n");
		} else {
			System.out.println("찾는 값이 없습니다.");
		}

		// 수정, 10을 1로 수정한다.
		System.out.println("수정, 10을 1로 수정한다.");
		if (datas.contains(30)) {
			datas.set(datas.indexOf(10), 1);
			// 10이 들어간 인덱스의 값을 1로 수정하라
			System.out.println(datas+"\n");
		}

		// 삭제 (값으로 삭제) 20을 삭제한다
		System.out.println("삭제 (값으로 삭제) 20을 삭제한다");
		if (datas.contains(20)) {
			datas.remove(Integer.valueOf(20));
			//Object.값 형식
			System.out.println(datas+"\n");
		}

		// 삭제 (인덱스로 삭제) 50을 삭제한다
		System.out.println("삭제 (인덱스로 삭제) 50을 삭제한다");
		if (datas.contains(50)) {
			datas.remove(datas.indexOf(50));
			System.out.println(datas+"\n");
		}
		
	}
}
