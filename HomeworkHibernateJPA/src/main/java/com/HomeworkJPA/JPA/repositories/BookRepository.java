package com.HomeworkJPA.JPA.repositories;

import com.HomeworkJPA.JPA.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
