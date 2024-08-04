package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args)throws IOException {
		BufferedWriter bufferedWiter = new BufferedWriter(new FileWriter("fish.txt",true));
		
//		bufferedWiter.write("고등어");
//		bufferedWiter.newLine();
//		bufferedWiter.write("연어");
//		bufferedWiter.newLine();
//		bufferedWiter.write("참치");
//		bufferedWiter.newLine();
//		
//		bufferedWiter.close();
		//입력 끝나면 닫아주기 아니면 계속 읽을때마다 써져서 출력됨
		
		BufferedReader bufferedReader = null;
		String line = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("fish.txt"));

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("존재하지 않는 파일입니다.");
		}
		bufferedReader.close();
	}
}
