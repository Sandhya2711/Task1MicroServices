package com.DMAT.microservice.userassessmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DMAT.microservice.userassessmentservice.modal.UserAnswerResponse;
import com.DMAT.microservice.userassessmentservice.modal.UserResult;
import com.DMAT.microservice.userassessmentservice.service.UserAssessmentService;

@RestController
public class UserAssessmentController {

	@Autowired
	UserAssessmentService userAssessmentService;
	
	@PostMapping("/userAssessment")
	public UserResult getUserResult(@RequestBody UserAnswerResponse userAnswerResponse){
		
		System.out.println("in userassessmentontroller"+userAnswerResponse);
		
		return userAssessmentService.caclAssessmentResult(userAnswerResponse);
	}
}
