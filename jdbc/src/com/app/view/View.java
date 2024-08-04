package com.app.view;

import com.app.member.repository.MemberDAO;
import com.app.member.repository.PostDAO;
import com.app.member.repository.ReplyDAO;

public class View {
	public static void main(String[] args) {
//		ID가 1인 맴버 조회
//		MemberDAO memberDAO = new MemberDAO();
//		
//		System.out.println(memberDAO.select(1L));
		
		
//		맴버 전체 조회
//		MemberDAO memberDAO = new MemberDAO();
//		
//		System.out.println(memberDAO.selectAll());
		
//		ID가 1인 게시물 조회		
//		PostDAO postDAO =  new PostDAO();
//		System.out.println(postDAO.select(1L));
		
//		게시물 전체 조회 (게시물 작성자 이름까지)
//		PostDAO postDAO =  new PostDAO();
//		System.out.println(postDAO.selectAll());
		
		
//		ReplyDAO replyDAO = new ReplyDAO();
//		System.out.println(replyDAO.select(1L));
		
		ReplyDAO replyDAO = new ReplyDAO();
		System.out.println(replyDAO.selectAll());
		
	}
}
