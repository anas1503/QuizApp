package com.quizapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

import com.quizapp.models.Question;
import com.quizapp.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	
	@PostMapping("/add")
	public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
		
		return questionService.createQuestion(question);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Question>> getAllQuestions()
	{
		return questionService.showAllQuestions();
		
	}
	 
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Question> getQuestion(@PathVariable long id)
	{
		return questionService.getQuestionById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteQuestion(@PathVariable long id)
	{
		questionService.deleteQuestion(id);
	}
	
	
	
	
	
	
	
}
