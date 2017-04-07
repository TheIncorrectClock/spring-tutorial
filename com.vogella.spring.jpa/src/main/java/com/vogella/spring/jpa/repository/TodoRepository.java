package com.vogella.spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.vogella.spring.jpa.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long>{

}
