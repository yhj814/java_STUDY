package com.app.domain.reply;

import java.util.Objects;

public class ReplyDTO {
   private Long id;
   private String replyContent;
   private Long postId;
   private Long memberId;
   private String memberName;
   private String createdDate;
   private String updatedDate;
   
   public ReplyDTO() {;}

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

   public Long getPostId() {
      return postId;
   }

   public void setPostId(Long postId) {
      this.postId = postId;
   }

   public Long getMemberId() {
      return memberId;
   }

   public void setMemberId(Long memberId) {
      this.memberId = memberId;
   }

   public String getMemberName() {
      return memberName;
   }

   public void setMemberName(String memberName) {
      this.memberName = memberName;
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
      return "ReplyDTO [id=" + id + ", replyContent=" + replyContent + ", postId=" + postId + ", memberId=" + memberId
            + ", memberName=" + memberName + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
   }

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
      ReplyDTO other = (ReplyDTO) obj;
      return Objects.equals(id, other.id);
   }
   
   public ReplyVO toVO() {
      ReplyVO replyVO = new ReplyVO();
      replyVO.setId(this.getId());
      replyVO.setMemberId(this.getMemberId());
      replyVO.setPostId(this.getPostId());
      replyVO.setReplyContent(this.getReplyContent());
      replyVO.setCreatedDate(this.getCreatedDate());
      replyVO.setUpdatedDate(this.getUpdatedDate());
      return replyVO;
   }
}





















