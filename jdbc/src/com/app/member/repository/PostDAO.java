package com.app.member.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.jdbc.configuration.Configuration;
import com.app.member.domain.MemberVO;
import com.app.member.domain.PostVO;

public class PostDAO{
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	추가하기
	public void insert(PostVO postVO) {
		String query = "INSERT INTO TBL_POST " + "(ID, POST_TITLE, POST_CONTENT, MEMBER_ID, "
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, postVO.getpostTitle());
			preparedStatement.setString(2, postVO.getPostContent());
			preparedStatement.setInt(3, postVO.getMemberId());

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

//  조회하기
	public PostVO select(Long id) {
		PostVO postVO = new PostVO();
		String query = "SELECT ID, POST_TITLE, POST_CONTENT, MEMBER_ID, CREATED_DATE, UPDATED_DATE "
		+ "FROM TBL_POST "
		+ "WHERE ID = ?";
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			resultSet.next();
			postVO.setId(resultSet.getLong("ID"));
			postVO.setpostTitle(resultSet.getString("POST_TITLE"));
			postVO.setPostContent(resultSet.getString("POST_CONTENT"));
			postVO.setMemberId(resultSet.getInt("MEMBER_ID"));
			postVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
			postVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
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
		return postVO;
	}

//  수정하기
	public void update(PostVO postVO) {
		String query = "UPDATE TBL_ " + "SET POST_TITLE = ?, POST_CONTENT = ?, MEMBER_ID = ?, " + "WHERE ID = ?";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, postVO.getpostTitle());
			preparedStatement.setString(2, postVO.getPostContent());
			preparedStatement.setInt(3, postVO.getMemberId());
			preparedStatement.setLong(4, postVO.getId());

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

//  삭제하기
	public void delete(Long id) {
		String query = "DELETE FROM TBL_POST WHERE ID = ?";

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
	public ArrayList<PostVO> selectAll() {
		ArrayList<PostVO> posts = new ArrayList<PostVO>();
		PostVO postVO = null;
		//중요 : JOIN 할 테이블을 포함한 현재 테이블, SELECT할 쿼리들까지 알리아스를 이용해 이름을 다 붙여줘야 모호성이 사라진다
		String query = "SELECT P.ID AS POST_ID, P.POST_TITLE, P.POST_CONTENT, P.MEMBER_ID, M.MEMBER_NAME, "
				+ "P.CREATED_DATE AS POST_CREATED_DATE, P.UPDATED_DATE AS POST_UPDATED_DATE " 
				+ "FROM TBL_POST P JOIN TBL_MEMBER M "
				+ "ON P.MEMBER_ID = M.ID ";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				do {
					postVO = new PostVO();
					postVO.setId(resultSet.getLong("POST_ID"));
					postVO.setpostTitle(resultSet.getString("POST_TITLE"));
					postVO.setPostContent(resultSet.getString("POST_CONTENT"));
					postVO.setMemberId(resultSet.getInt("MEMBER_ID"));
					postVO.setMemberName(resultSet.getString("MEMBER_NAME"));
					postVO.setCreatedDate(resultSet.getString("POST_CREATED_DATE"));
					postVO.setUpdatedDate(resultSet.getString("POST_UPDATED_DATE"));

					posts.add(postVO);

				} while (resultSet.next());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
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
		return posts;
	}
}
