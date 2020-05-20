package com.DMAT.microservice.mainservice.modal;

public class QuestionAnswer {

	private int qid;
	private String question;
	private String section;
	private String optionA; 
	private String optionB; 
	private String optionC; 
	private String optionD; 
	private String correctAnswer; 
	
	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}
	
	
	public QuestionAnswer() {
		// TODO Auto-generated constructor stub
	}


	public int getQid() {
		return qid;
	}


	public void setQid(int qid) {
		this.qid = qid;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getOptionA() {
		return optionA;
	}


	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}


	public String getOptionB() {
		return optionB;
	}


	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}


	public String getOptionC() {
		return optionC;
	}


	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}


	public String getOptionD() {
		return optionD;
	}


	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}


	public QuestionAnswer(int qid, String question, String section, String optionA, String optionB, String optionC,
			String optionD, String correctAnswer) {
		super();
		this.qid = qid;
		this.question = question;
		this.section = section;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.correctAnswer = correctAnswer;
	}


	public String getCorrectAnswer() {
		return correctAnswer;
	}


	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}


	@Override
	public String toString() {
		return "QuestionAnswer [qid=" + qid + ", question=" + question + ", section=" + section + ", optionA="
				+ optionA + ", optionB=" + optionB + ", optionC=" + optionC + ", optionD=" + optionD
				+ ", correctAnswer=" + correctAnswer + "]";
	}
	
}
