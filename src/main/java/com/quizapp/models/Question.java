package com.quizapp.models;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Question {

      @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String category;
	private String difficultylevel;
	private String op1;
	private String op2;
	private String op3;
	private String op4;
	private String question_title;
	private String answer;
	
	 
	
	
}
