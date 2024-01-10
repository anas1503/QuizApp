package com.quizapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

import com.quizapp.models.Question;
import com.quizapp.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	
	@GetMapping("/get/{id}")
	public Question getQuestion(@PathVariable long id)
	{
		return questionService.getQuestionById(id);
	}
	
	
	
	
	
}
