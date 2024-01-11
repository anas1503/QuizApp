package com.quizapp.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Question> createQuestion(Question question) {
 		
		try {
			Question ques=questionRepo.save(question);
			
			return new ResponseEntity<>(ques,HttpStatus.CREATED);
		}
	  catch(Exception e)
		{
		  e.printStackTrace();
		}
		
		return new ResponseEntity<>(new Question(),HttpStatus.BAD_REQUEST);
		
	}

	@Override
	public ResponseEntity<Question> updateQuestion(Question question, long id) {
		
		try {
			Optional<Question> ques=questionRepo.findById(id);
			 
			return  new ResponseEntity<>(null,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		
	}

	@Override
	public void deleteQuestion(long id) {
		questionRepo.deleteById(id);
		
	}

	@Override
	public ResponseEntity<Question> getQuestionById(long id) {
		
		try {
			Question ques=questionRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("question", "questionId", id));
	 		 
			
			return new ResponseEntity<>(ques,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		
	}

	@Override
	public ResponseEntity<List<Question>> showAllQuestions() {
 
		try {
			List<Question> questions=questionRepo.findAll();
			
			return new ResponseEntity<>(questions,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
	}

	 
	}

	 

	 
	 

