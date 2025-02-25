package com.DMAT.microservice.userassessmentservice.modal;

public class UserResult {

	private String section;
	private float current;
	private float actual;
	
	public UserResult(String section, float current, float actual) {
		super();
		this.section = section;
		this.current = current;
		this.actual = actual;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	public UserResult() {
		// TODO Auto-generated constructor stub
	}
	public float getCurrent() {
		return current;
	}
	public void setCurrent(float current) {
		this.current = current;
	}
	public float getActual() {
		return actual;
	}
	public void setActual(float actual) {
		this.actual = actual;
	}
	
	@Override
	public String toString() {
		return "UserResult [section"+section+", current=" + current + ", actual=" + actual + "]";
	}
	
	
}
