package com.onlinequiz.pro.repositories;

import com.onlinequiz.pro.models.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question,Integer> {
}
