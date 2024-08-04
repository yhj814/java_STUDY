package com.app.member.domain;

import java.util.Objects;

public class ReplyVO extends PostVO{
	private Long id;
	private String replyContent;
	private int memberId;
	private int postId;
	
	public ReplyVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	@Override
	public String toString() {
		return "ReplyVO [id=" + id + ", replyContent=" + replyContent + ", memberId=" + memberId + ", postId=" + postId
				+ ", getpostTitle()=" + getpostTitle() + ", getMemberName()=" + getMemberName() + "]"+"\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplyVO other = (ReplyVO) obj;
		return Objects.equals(id, other.id);
	}
}
