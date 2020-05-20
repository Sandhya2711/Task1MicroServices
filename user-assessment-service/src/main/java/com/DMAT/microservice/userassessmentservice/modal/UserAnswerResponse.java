package com.DMAT.microservice.userassessmentservice.modal;

import java.util.List;


public class UserAnswerResponse {


    private int assessmentId; 
	private List<UserAnswer> userAnswers;
	public UserAnswerResponse() {
		// TODO Auto-generated constructor stub
	}

	public UserAnswerResponse(int assessmentId,List<UserAnswer> userAnswers) {
		super();
		this.assessmentId=assessmentId;
		this.userAnswers = userAnswers;
	}
	public int getAssessmentId() {
		return assessmentId;
	}

    public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}

	public List<UserAnswer> getUserAnswers() {
		return userAnswers;
	}

	public void setUserAnswers(List<UserAnswer> userAnswers) {
		this.userAnswers = userAnswers;
	}
}
