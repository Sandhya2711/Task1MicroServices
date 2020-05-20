package com.DMAT.microservice.mainservice.modal;

public class UserAnswer {

	//static private int assessmentId;
	private int qid;
	private String userAnswer;

	public UserAnswer() {
		// TODO Auto-generated constructor stub
	}

	public UserAnswer( int qid, String userAnswer) {
		super();
		this.qid = qid;
		this.userAnswer = userAnswer;
	}

//	static public int getAssessmentId() {
//		return assessmentId;
//	}
//
//	static public void setAssessmentId(int assessmentId) {
//		assessmentId = assessmentId;
//	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}
}
