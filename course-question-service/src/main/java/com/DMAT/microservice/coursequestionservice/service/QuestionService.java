package com.DMAT.microservice.coursequestionservice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.DMAT.microservice.coursequestionservice.modal.QuestionAnswer;

@Service
public class QuestionService {
	
	
	List<QuestionAnswer> allQuestions;
	
	public QuestionService() {
		// TODO Auto-generated constructor stub
	}

	public List<QuestionAnswer> getAllQuestion() {
		
		// for demo using hard coded values,should be later fetched through database
	    allQuestions=Arrays.asList(new QuestionAnswer(111,"question 1", "Technology","Question1 optionA","Question1 optionB","Question1 optionC","Question1 optionD","Question1 optionA"),
				new QuestionAnswer(112,"question 2", "Technology","Question2 optionA","Question2 optionB","Question2 optionC","Question2 optionD","Question2 optionB"),
				new QuestionAnswer(113,"question 3", "Process","Question3 optionA","Question3 optionB","Question2 optionC","Question3 optionD","Question3 optionB"),
				new QuestionAnswer(114,"question 4", "Process","Question4 optionA","Question4 optionB","Question2 optionC","Question4 optionD","Question4 optionB"),
				new QuestionAnswer(115,"question 5", "Outcome","Question5 optionA","Question5 optionB","Question2 optionC","Question5 optionD","Question5 optionB"),
				new QuestionAnswer(116,"question 6", "Process","Question6 optionA","Question6 optionB","Question2 optionC","Question6 optionD","Question6 optionB"));
		return allQuestions;
	}
	
   public QuestionAnswer getQuestionById(int qid) {
		
	   QuestionAnswer ques= getAllQuestion().stream().filter(question->question.getQid()==qid).findFirst().orElse(null);
		return ques;
	}
   
   public List<QuestionAnswer> getQuestionBySectionId(String section) {
		
	    List<QuestionAnswer> ques=(List<QuestionAnswer>) getAllQuestion().stream().
	    		filter(question->question.getSection().equals(section))
	    		.collect(Collectors.toList());
	    
		return ques;
	}
}
