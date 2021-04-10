package com.example.docs.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.docs.models.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findById(long id);
}
