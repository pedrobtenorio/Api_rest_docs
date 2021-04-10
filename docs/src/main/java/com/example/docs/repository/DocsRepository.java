package com.example.docs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.docs.models.Docs;

public interface DocsRepository extends JpaRepository<Docs, Long> {

    Docs findById(long id);

}
