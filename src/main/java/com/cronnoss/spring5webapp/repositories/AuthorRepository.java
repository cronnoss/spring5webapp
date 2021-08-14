package com.cronnoss.spring5webapp.repositories;

import com.cronnoss.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
