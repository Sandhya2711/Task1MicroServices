package com.DMAT.microservice.mainservice.modal;

import java.util.List;

public class QuestionArray {

	private List<QuestionAnswer> quesList;
	public QuestionArray() {
		// TODO Auto-generated constructor stub
	}
	public QuestionArray(List<QuestionAnswer> quesList) {
		super();
		this.quesList = quesList;
	}
	public List<QuestionAnswer> getQuesList() {
		return quesList;
	}
	public void setQuesList(List<QuestionAnswer> quesList) {
		this.quesList = quesList;
	}
	
}
