package com.DMAT.microservice.userassessmentservice.service;

import org.springframework.stereotype.Service;

import com.DMAT.microservice.userassessmentservice.modal.UserAnswerResponse;
import com.DMAT.microservice.userassessmentservice.modal.UserResult;

@Service
public class UserAssessmentService {

	public UserResult caclAssessmentResult(UserAnswerResponse answerResponse) {
		
		return new UserResult("process",45, 100);
	}
}
