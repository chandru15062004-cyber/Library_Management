package com.example.demo.repositorylibrary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.library.LibraryManagement;

public interface RepositoryLibrary extends JpaRepository<LibraryManagement, Long> {

}
