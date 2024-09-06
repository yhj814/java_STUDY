package com.app.view;

import com.app.repository.member.MemberDAO_1;
import com.app.repository.post.PostDAO_1;
import com.app.repository.reply.ReplyDAO_1;

public class View_1 {
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
//		PostDAO_1 postDAO =  new PostDAO_1();
//		System.out.println(postDAO.select(1L));
		
//		게시물 전체 조회 (게시물 작성자 이름까지)
//		PostDAO_1 postDAO =  new PostDAO_1();
//		System.out.println(postDAO.selectAll());
		
//		ID가 1인 댓글 단 사람조회
		ReplyDAO_1 replyDAO = new ReplyDAO_1();
		System.out.println(replyDAO.select(1L));
		
//		댓글단 맴버 전체 조회
//		ReplyDAO_1 replyDAO = new ReplyDAO_1();
//		System.out.println(replyDAO.selectAll());
		
	}
}
