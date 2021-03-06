package com.mmmteam.doit.repository;

import com.mmmteam.doit.domain.Answer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM answer ORDER BY random() LIMIT 1")
    Answer random();
}
