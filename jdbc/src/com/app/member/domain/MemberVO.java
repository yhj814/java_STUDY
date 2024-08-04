package com.app.member.domain;

import java.util.Objects;

//dbeaver에서 만든 테이블을 토대로 VO를 구성한다 
public class MemberVO {
	private Long id; //PK
	private String memberEmail;	
	private String memberPassword;
	private String memberName;
	private int memberAge;
	private int memberGender;
	private String createdDate;
	private String updatedDate;

	public MemberVO() {
		;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public int getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(int memberGender) {
		this.memberGender = memberGender;
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
		return "MemberVO [id=" + id + ", memberEmail=" + memberEmail + ", memberPassword=" + memberPassword
				+ ", memberName=" + memberName + ", memberAge=" + memberAge + ", memberGender=" + memberGender
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate  + "]"+ "\n";
	}

	@Override
	public int hashCode() {		//id만 비교할것이기때문에 PK 만 받아와야한다
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
		MemberVO other = (MemberVO) obj;
		return Objects.equals(id, other.id);
	}
}
