package com.DMAT.microservice.mainservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.DMAT.microservice.mainservice.modal.QuestionAnswer;
import com.DMAT.microservice.mainservice.modal.QuestionArray;
import com.DMAT.microservice.mainservice.modal.UserAnswer;
import com.DMAT.microservice.mainservice.modal.UserAnswerRequest;
import com.DMAT.microservice.mainservice.modal.UserResult;

@RestController
@RequestMapping("/assessment")
public class MainController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/questionCatalog")
	public List<QuestionAnswer> getAllQuestions() {

		// calling course-question-service
		QuestionArray questionArray = restTemplate.getForObject("http://localhost:2222/question/", QuestionArray.class);

		List<QuestionAnswer> questionList = questionArray.getQuesList();
		System.out.println("list" + questionList);

		return questionList;

	}

	@RequestMapping("questionCatalog/{section}")
	public List<QuestionAnswer> getQuestionsSectionWise(@PathVariable String section) {

		// calling course-question-service
		QuestionArray questionArray = restTemplate.getForObject("http://localhost:2222/question/section/" + section,
				QuestionArray.class);

		List<QuestionAnswer> questionList = questionArray.getQuesList();
		System.out.println(" here new list" + questionList);

		return questionList;
	}

	@RequestMapping("/submit")
	public UserResult getResultData() {

		// HardCoding the answerRequest This userAnswerarray will be given by angular rest api
		
		List<UserAnswer> userAnswer = Arrays.asList(new UserAnswer(111, "optionB"), new UserAnswer(112, "optionA"),
				new UserAnswer(113, "optionD"), new UserAnswer(114, "optionD"), new UserAnswer(115, "optionC"),
				new UserAnswer(116, "optionB"));

		UserAnswerRequest answerRequest = new UserAnswerRequest(123456, userAnswer);

		//calling user-assessment-service
		return restTemplate.postForObject("http://localhost:4444/userAssessment", answerRequest, UserResult.class);

	}

}
