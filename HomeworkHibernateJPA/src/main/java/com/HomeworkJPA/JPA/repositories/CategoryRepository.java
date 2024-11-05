package com.HomeworkJPA.JPA.repositories;

import com.HomeworkJPA.JPA.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
