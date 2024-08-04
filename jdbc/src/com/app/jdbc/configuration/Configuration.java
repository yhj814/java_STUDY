package com.app.jdbc.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {
//	객체생성
	public static Connection getConnection() {
		Connection connection = null;

		String userName = "scott";
		String password = "1234";
//		경로설정
		String url = "jdbc:oracle:thin:@localhost:1521:XE";

//		문자열오타날수 있기떄문에 try catch문 써주기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 정보 오류");
			e.printStackTrace();
		}
//		리턴 꼭 해주기
		return connection;
	}

}
