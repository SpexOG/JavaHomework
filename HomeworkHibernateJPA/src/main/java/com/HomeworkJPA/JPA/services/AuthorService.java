package com.HomeworkJPA.JPA.services;

import com.HomeworkJPA.JPA.models.Author;
import com.HomeworkJPA.JPA.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public Iterable<Author> saveAll(List<Author> authors) {
        return authorRepository.saveAll(authors);
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }

    public Optional<Author> findAuthorByName(String name) {
        return authorRepository.findByName(name);
    }

    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> findAuthorById(Long id) {
        return authorRepository.findById(id);
    }
}
