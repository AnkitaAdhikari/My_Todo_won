package com.example.practice.ForMySelf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.ForMySelf.entity.TodoEntity;
import com.example.practice.ForMySelf.repo.TodoRepo;

@Service
public class TodoService {
	@Autowired
	TodoRepo repo;

	public TodoEntity createtodo(TodoEntity entity) {

		return repo.save(entity);

	}

	public List<TodoEntity> getalltodos() {

		return repo.findAll();
	}

	public void deletetodo(Long id) {
		repo.deleteById(id);
	}

}
