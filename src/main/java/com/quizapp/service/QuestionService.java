package com.quizapp.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.quizapp.models.Question;


@Service
public interface QuestionService {

	
	Question createQuestion(Question question);
	Question updateQuestion(Question question,long id);
	void deleteQuestion(long id);
	
	Question getQuestionById(long id);
	
    
}
