package com.example.practice.ForMySelf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.ForMySelf.entity.TodoEntity;
import com.example.practice.ForMySelf.service.TodoService;

@RestController
public class TodoController {
	@Autowired
	TodoService service;

	@PostMapping("/CreateTodo")
	public TodoEntity createtodo(@RequestBody TodoEntity dto) {
		return service.createtodo(dto);
	}

	@GetMapping("/GetAllTodos")
	public List<TodoEntity> getall() {
		return service.getalltodos();
	}

	@DeleteMapping("/DeleteTodo/{todoId}")
	public String delete(@PathVariable Long todoId) {
		service.deletetodo(todoId);
		return "Todo with id " + todoId + " deleted successfully";
	}
}
