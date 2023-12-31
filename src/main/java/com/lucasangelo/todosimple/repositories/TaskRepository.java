package com.lucasangelo.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasangelo.todosimple.models.Task;
import java.util.List;


public interface TaskRepository extends JpaRepository<Task,Long>{
    
    List<Task> findByUser_id(Long id);

}
