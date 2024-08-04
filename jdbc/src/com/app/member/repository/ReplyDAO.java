package com.app.member.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.jdbc.configuration.Configuration;
import com.app.member.domain.PostVO;
import com.app.member.domain.ReplyVO;

public class ReplyDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	추가하기
	public void insert(ReplyVO replyVO) {
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
	public ReplyVO select(Long id) {
		ReplyVO replyVO = new ReplyVO();
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
	public void update(ReplyVO replyVO) {
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
	public ArrayList<ReplyVO> selectAll() {
		ArrayList<ReplyVO> replys = new ArrayList<ReplyVO>();
		ReplyVO replyVO = null;
		String query = "SELECT ID, REPLY_CONTENT, MEMBER_ID, POST_ID "
				+ "FROM TBL_REPLY ";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				do {
					replyVO = new ReplyVO();
					replyVO.setId(resultSet.getLong("ID"));
					replyVO.setReplyContent(resultSet.getString("REPLY_CONTENT"));
					replyVO.setMemberId(resultSet.getInt("MEMBER_ID"));
					replyVO.setPostId(resultSet.getInt("POST_ID"));
					
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
