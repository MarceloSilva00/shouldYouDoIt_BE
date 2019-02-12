package com.mmmteam.doit.repository;

import com.mmmteam.doit.domain.Custom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomAnswerRepository extends CrudRepository<Custom, Long> {

    Custom findByKey(String key);
}
