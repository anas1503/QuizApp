package com.quizapp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizapp.repository.QuestionRepo;
import com.quizapp.service.QuestionService;
import com.quizapp.exceptions.ResourceNotFoundException;
import com.quizapp.models.Question;

@Service
public class QuestionImpl implements QuestionService {

	@Autowired
	QuestionRepo questionRepo;
	
	 

	@Override
	public Question createQuestion(Question question) {
 		
		Question ques=questionRepo.save(question);
		
		return ques;
	}

	@Override
	public Question updateQuestion(Question question, Integer id) {
		Optional<Question> ques=questionRepo.findById(id);
		
		 
		return null;
	}

	@Override
	public void deleteQuestion(Integer id) {
		questionRepo.deleteById(id);
		
	}

	@Override
	public Question getQuestionById(Integer id) {
		Question ques=questionRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("question", "questionId", id));
 		 
		
            
		 
		return ques;
	}

	@Override
	public List<Question> showAllQuestions() {
 
		List<Question> questions=questionRepo.findAll();
		
		return questions;
	}

	 
	}

	 

	 
	 

