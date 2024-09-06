package com.app.domain.reply;

import java.util.Objects;

public class ReplyVO_1{
	private Long id;
	private String replyContent;
	private int memberId;
	private int postId;
	private String createdDate;
	private String updatedDate;
	

	public ReplyVO_1() {;}

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
	
	public String getCreatedDate() {
		return createdDate;
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

	
	@Override
	public String toString() {
		return "ReplyVO [id=" + id + ", replyContent=" + replyContent + ", memberId=" + memberId + ", postId=" + postId
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]"+ "\n";
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
		ReplyVO_1 other = (ReplyVO_1) obj;
		return Objects.equals(id, other.id);
	}
}
