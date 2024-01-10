package com.quizapp.serviceImpl;

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
	public Question updateQuestion(Question question, long id) {
		Optional<Question> ques=questionRepo.findById(id);
		
		 
		return null;
	}

	@Override
	public void deleteQuestion(long id) {
		questionRepo.deleteById(id);
		
	}

	@Override
	public Question getQuestionById(long id) {
		Question ques=questionRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("question", "questionId", id));
 		 
		
            
		 
		return ques;
	}

	 
	}

	 

	 
	 

