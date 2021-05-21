package com.Koreait.board5.cmt;

public class CmtVO {
	private int icmt;
	private int iboard;
	private int iuser;                 //iboard와  iuser를 사용하는 이유는 어떤 글에 어떤 유저가 댓글을 달았는지 확인
	private String cmt;
	private String regdate;
	
	private String unm;

	public int getIcmt() {
		return icmt;
	}

	public void setIcmt(int icmt) {
		this.icmt = icmt;
	}

	public int getIboard() {
		return iboard;
	}

	public void setIboard(int iboard) {
		this.iboard = iboard;
	}

	public int getIuser() {
		return iuser;
	}

	public void setIuser(int iuser) {
		this.iuser = iuser;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}
	
	
}
