package com.nischalchand.taskmanager.repository;

import com.nischalchand.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task,Long> {

}
