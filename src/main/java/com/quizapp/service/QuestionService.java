package com.quizapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quizapp.models.Question;


@Service
public interface QuestionService {

	
	ResponseEntity<Question> createQuestion(Question question);
	ResponseEntity<Question> updateQuestion(Question question,long id);
	void deleteQuestion(long id);
	ResponseEntity<List<Question>> showAllQuestions();
	ResponseEntity<Question> getQuestionById(long id);
	
    
}
