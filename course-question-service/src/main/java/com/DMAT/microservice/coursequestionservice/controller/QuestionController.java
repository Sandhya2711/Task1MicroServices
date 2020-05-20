package com.DMAT.microservice.coursequestionservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DMAT.microservice.coursequestionservice.modal.QuestionAnswer;
import com.DMAT.microservice.coursequestionservice.modal.QuestionArray;
import com.DMAT.microservice.coursequestionservice.service.QuestionService;

@RequestMapping("question")
@RestController
public class QuestionController {
	
	
	@Autowired
	QuestionService questionService;

	@GetMapping("/{qid}")
	public QuestionAnswer getQuestion(@PathVariable("qid") int qid) {

		return questionService.getQuestionById(qid);
	}
	
	@RequestMapping("/")
	public QuestionArray getAllQuestions() {
		
		QuestionArray questArray=new QuestionArray();
		questArray.setQuesList(questionService.getAllQuestion());

		System.out.println("ques"+questArray);
		return questArray;
	}

	@GetMapping("/section/{section}")
	public QuestionArray getQuestionSectionWise(@PathVariable("section") String section) {

		 QuestionArray questArray=new QuestionArray();
		 questArray.setQuesList(questionService.getQuestionBySectionId(section));
		 
		 return questArray;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Autowired
//	QuestionService questionService;
//
//	@GetMapping("/{qid}")
//	public Question getQuestion(@PathVariable("qid") int qid) {
//
//		return questionService.getQuestionById(qid);
//	}
//	
//	@RequestMapping("/")
//	public QuestionArray getAllQuestions() {
//		
//		QuestionArray questArray=new QuestionArray();
//		questArray.setQuesList(questionService.getAllQuestion());
//
//		System.out.println("ques"+questArray);
//		return questArray;
//	}
//
//	@GetMapping("/section/{sectionId}")
//	public QuestionArray getQuestionSectionWise(@PathVariable("sectionId") int sectionId) {
//
//		 QuestionArray questArray=new QuestionArray();
//		 questArray.setQuesList(questionService.getQuestionBySectionId(sectionId));
//		 
//		 return questArray;
//	}
}
