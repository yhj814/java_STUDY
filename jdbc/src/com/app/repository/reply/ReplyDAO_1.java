package com.app.repository.reply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.domain.post.PostVO_1;
import com.app.domain.reply.ReplyVO_1;
import com.app.jdbc.configuration.Configuration;

public class ReplyDAO_1 {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	추가하기
	public void insert(ReplyVO_1 replyVO) {
		String query = "INSERT INTO TBL_REPLY " + "ID, REPLY_CONTENT, MEMBER_ID, POST_ID "
				+ "VALUES(SEQ_REPLY.NEXTVAL, ?, ?, ?) ";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setInt(2, replyVO.getMemberId());
			preparedStatement.setInt(3, replyVO.getPostId());

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
	public ReplyVO_1 select(Long id) {
		ReplyVO_1 replyVO = new ReplyVO_1();
		String query = "SELECT ID, REPLY_CONTENT, MEMBER_ID, POST_ID " + "FROM TBL_REPLY " + "WHERE ID = ? ";
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			resultSet.next();
			replyVO.setId(resultSet.getLong("ID"));
			replyVO.setReplyContent(resultSet.getString("REPLY_CONTENT"));
			replyVO.setMemberId(resultSet.getInt("MEMBER_ID"));
			replyVO.setPostId(resultSet.getInt("POST_ID"));

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
		return replyVO;
	}

//  수정하기
	public void update(ReplyVO_1 replyVO) {
		String query = "UPDATE TBL_ " + "SET REPLY_CONTENT = ?, MEMBER_ID = ?, POST_ID=? " + "WHERE ID = ?";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setInt(2, replyVO.getMemberId());
			preparedStatement.setInt(3, replyVO.getPostId());
			preparedStatement.setLong(4, replyVO.getId());

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
		String query = "DELETE FROM TBL_REPLY WHERE ID = ?";

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
	public ArrayList<ReplyVO_1> selectAll() {
		ArrayList<ReplyVO_1> replys = new ArrayList<ReplyVO_1>();
		ReplyVO_1 replyVO = null;
		String query = "SELECT ID, REPLY_CONTENT, MEMBER_ID, POST_ID , CREATED_DATE, UPDATED_DATE "
				+ "FROM TBL_REPLY ";
		

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				do {
					replyVO = new ReplyVO_1();
					replyVO.setId(resultSet.getLong("ID"));
					replyVO.setReplyContent(resultSet.getString("REPLY_CONTENT"));
					replyVO.setMemberId(resultSet.getInt("MEMBER_ID"));
					replyVO.setPostId(resultSet.getInt("POST_ID"));
					replyVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
					replyVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
					
					replys.add(replyVO);

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
		return replys;
	}

}
