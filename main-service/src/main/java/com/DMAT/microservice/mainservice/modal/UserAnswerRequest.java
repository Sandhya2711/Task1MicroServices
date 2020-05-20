package com.DMAT.microservice.mainservice.modal;

import java.util.List;

public class UserAnswerRequest {
	
   private int assessmentId; 
	private List<UserAnswer> userAnswers;
	public UserAnswerRequest() {
		// TODO Auto-generated constructor stub
	}

	public UserAnswerRequest(int assessmentId, List<UserAnswer> userAnswers) {
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
