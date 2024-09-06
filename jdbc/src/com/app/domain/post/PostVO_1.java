package com.app.domain.post;

import java.util.Objects;

import com.app.domain.member.MemberVO_1;

//MemberVO를 상속받아야 게시물 작성자 맴버 정보를 가져올 수 있다
public class PostVO_1 extends MemberVO_1{
	private Long id;
	private String postTitle;
	private String postContent;
	private int memberId;
	private String createdDate;
	private String updatedDate;

	public PostVO_1() {
		;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getpostTitle() {
		return postTitle;
	}

	public void setpostTitle(String title) {
		this.postTitle = title;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate; 
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	//getter setter 에 재정의 할 필요없이 memberVO를 상속 받았기 떄문에 toString에서 가져올 값만 가져와 입력하면 된다
	@Override
	public String toString() {
		return "PostVO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent + ", memberId="
				+ memberId + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", MemberName()="
				+ getMemberName() + "]"+"\n";
	}// alt + shift + s  toString 에서 선택해 가져오면된다

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostVO_1 other = (PostVO_1) obj;
		return Objects.equals(id, other.id);
	}

}