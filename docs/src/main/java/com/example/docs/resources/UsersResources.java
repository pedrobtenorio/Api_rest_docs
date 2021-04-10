package com.example.docs.resources;


import com.example.docs.models.Users;

import com.example.docs.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UsersResources {

    @Autowired
    UsersRepository usersRepository;


    @GetMapping("/users")
    public List<Users> listallUsers()
    {
        return  usersRepository.findAll();

    }
    @GetMapping("/users/{id}")
    public Users UsersId(@PathVariable(value = "id") long id)
    {

        return usersRepository.findById(id);
    }



    @PostMapping("/users")
    public  Users SalvarUser(@RequestBody Users users)
    {
        return usersRepository.save(users);
    }

    @DeleteMapping("/users")
    public  void DeletarUser(@RequestBody Users docs)
    {
        usersRepository.delete(docs);
    }

    @PutMapping("/users")
    public Users atualizarUser(@RequestBody Users users)
    {
        return usersRepository.save(users);
    }




}
