package com.app.repository.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.domain.member.MemberVO_1;
import com.app.jdbc.configuration.Configuration;

public class MemberDAO_1 {
	
	//전역변수로 설정하기, 여기서만 쓸것이기 때문에 private 로 설정
	//import 해주기
	private Connection connection;
	private PreparedStatement preparedStatement;
	//DBMS가 자바로 넘어올때 Set자료구조이기 떄문에
	private ResultSet resultSet;

//추가하기
//넣는 값 설정 
	public void insert(MemberVO_1 memberVO) {
		//하나하나 다 치지말고 dbeaver 테이블 잡고 sql생성으로 실행값 copy 후 설정 안넣은 값은 Default 값으로 들어감
		//넣는 값을 정확히 모를때는 넣는 개수에 맞게 ? 해주기	
		String query = "INSERT INTO TBL_MEMBER " + "(ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER"
				+ "CRATED_DATE, UPDATED_DATE) "
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";																			
		
		try {
			//만들어놓은 Configuration 클래스로 연결해주기 sql예외 발생하기 때문에 try catch로 묶기
			connection = Configuration.getConnection();
			//받아온거를 담아주가 query= 내가 짠 query
			preparedStatement = connection.prepareStatement(query);	
			//타입에 맞게 나머지쿼리들 넣어주기, 숫자=쿼리순서
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setInt(4, memberVO.getMemberAge());
			preparedStatement.setInt(5, memberVO.getMemberGender());
			preparedStatement.setString(6, memberVO.getCreatedDate());
			preparedStatement.setString(7, memberVO.getUpdatedDate());
			
			//실행하는 버튼 , SELECT(조회)를 재외한 값을 넣는거는 executeUpdate
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		  //finally로 다시 try catch 쓰기
		} finally {
			try {
				//preparedStatement 실행끝났으면 닫기
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				//connection 실행끝났으면 닫기
				if (connection != null) {
					connection.close();
				}
			  //강제종료하기
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//  조회하기(한명)
//	조회는 행 -> 열 순으로 조회함 2차원 배열과 같다고 보면 된다
//	조회할때 중복값이 없는 pk(ID)로 조회 
	public MemberVO_1 select(Long id) {
		MemberVO_1 memberVO = new MemberVO_1();
//		dbeaver -> sql생성 -> copy 후 수정하기	WHERE로 누구 아이디인지 까지 가져와야한다
		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME ,MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE "
				+ "FROM TBL_MEMBER " 
				+ "WHERE ID = ?";
		
		try {
			//Configuration 클래스로 연결해주기 sql예외 발생하기 때문에 try catch로 묶기
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);	
			
			//채울값 ?가 있을때는 채워서 보내야한다 
			preparedStatement.setLong(1, id);

			//조회하는 버튼, SELECT(조회)는 resultSet으로 받아주고 executeQuery(리턴이 없음)를 써줘야함
			resultSet = preparedStatement.executeQuery();

			//행(set) 조회
			resultSet.next();
			//열(get) 조회
			memberVO.setId(resultSet.getLong("ID"));
			memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
			memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
			memberVO.setMemberName(resultSet.getString("MEMBER_NAME"));
			memberVO.setMemberAge(resultSet.getInt("MEMBER_AGE"));
			memberVO.setMemberGender(resultSet.getInt("MEMBER_GENDER"));
			memberVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
			memberVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));

		} catch (SQLException e) {
			e.printStackTrace();
			//finally로 다시 try catch 쓰기
		} finally {
			try {
				//resultSet 닫아주기
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		//조회한 값 리턴 해주기
		return memberVO;
	}

//  수정하기
//	수정완료한 정보를 넣어주면 되기떄문에, 수정전 객체 수정한 객체, 두개 만들필요없이 하나만 만들어 set 하면 된다.
	public void update(MemberVO_1 memberVO) {
//	dbeaver -> sql생성 -> copy	
		String query = "UPDATE TBL_MEMBER " + "SET MEMBER_EMAIL = ?, MEMBER_PASSWORD = ?, MEMBER_NAME = ?, "
				+ "MEMBER_AGE = ?, MEMBER_GENDER = ? ,UPDATED_DATE = SYSDATE " //수정한 날짜는 현재 날짜 
				+ "WHERE ID = ?";
		
		try {
			//Configuration 클래스로 연결해주기 sql예외 발생하기 때문에 try catch로 묶기
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setInt(4, memberVO.getMemberAge());
			preparedStatement.setInt(5, memberVO.getMemberGender());
			preparedStatement.setLong(6, memberVO.getId());

			//SELECT(조회)를 재외한 값을 넣는거는 executeUpdate
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//   삭제하기
//	PK(ID)만 삭제하면 다 삭제 된다
	public void delete(Long id) {
		String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//  전체 조회하기
//	받을 값이 없다
	public ArrayList<MemberVO_1> selectAll() {
		ArrayList<MemberVO_1> members = new ArrayList<MemberVO_1>();
		//객체 만들기
		MemberVO_1 memberVO = null;
		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE "
				+ "FROM TBL_MEMBER";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();
			//행 조회
			if (resultSet.next()) {
				do {
					//열조회
					//그다음 반복될때 매번 초기화 하기 위해 new 객체 생성
					memberVO = new MemberVO_1();
					memberVO.setId(resultSet.getLong("ID"));
					memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
					memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
					memberVO.setMemberName(resultSet.getString("MEMBER_NAME"));
					memberVO.setMemberAge(resultSet.getInt("MEMBER_AGE"));
					memberVO.setMemberGender(resultSet.getInt("MEMBER_GENDER"));
					memberVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
					memberVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));

					//위의 반복이 끝나고 다음 반복으로 가기전에 members에 저장된 정보를 담아두기
					//모든정보를 담고 While 문이 끝나면 members를 리턴해주면 된다
					members.add(memberVO);
					//헹 조회
				} while (resultSet.next());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//resulset도 썻기 때문에 닫아줘야함
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		//ArrayList 리턴
		return members;
	}
}
