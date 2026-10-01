package com.nischalchand.taskmanager.repository;

import com.nischalchand.taskmanager.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
