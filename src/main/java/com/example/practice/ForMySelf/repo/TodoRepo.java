package com.example.practice.ForMySelf.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.ForMySelf.entity.TodoEntity;

public interface TodoRepo  extends JpaRepository<TodoEntity, Long>{


}
