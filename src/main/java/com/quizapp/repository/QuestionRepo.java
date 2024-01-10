package com.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.quizapp.models.Question;


@Repository
public interface QuestionRepo extends JpaRepository<Question,Integer>{

}
