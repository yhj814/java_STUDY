package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//	throws 
//	메소드 안에서 반복되는 Exception에 대해 try catch를 작성해야 할 때,
//	메소드를 사용하는 쪽에서 한번만 try catch룰 작성하는것이 편하다
//	이럴 떄 메소드 소괄호 뒤에 throws를 작성하여 *사용하는 쪽*으로 해당 예외처리를 넘겨준다

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWiter = new BufferedWriter(new FileWriter("test.txt", true));
//																		true 전달하면 전에 값 유지하고 덮어쓰기
		bufferedWiter.write("햄버거");
		bufferedWiter.write("불고\n");
		bufferedWiter.newLine();
		// 줄바꿈 \n 안적고 이거 해도 줄바꿈 됨

		bufferedWiter.close();
//		입력다하면 무조건 close() 써줘야함 

		BufferedReader bufferedReader = null;
		String line = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("test.txt"));

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("존재하지 않는 파일입니다.");
		}
		bufferedReader.close();

	}
}
