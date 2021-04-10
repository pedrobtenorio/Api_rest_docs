package com.example.docs.resources;


import com.example.docs.models.Docs;
import com.example.docs.repository.DocsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class DocsResources {

    @Autowired
    DocsRepository docsRepository;

    @GetMapping("/docs")
    public List<Docs> listaDocs()
    {
        return  docsRepository.findAll();

    }
    @GetMapping("/docs/{id}")
    public Docs DocsID(@PathVariable(value = "id") long id)
    {
        return docsRepository.findById(id);
    }

    @PostMapping("/docs")
    public  Docs Salvar(@RequestBody Docs docs)
    {
        return docsRepository.save(docs);
    }

    @DeleteMapping("/docs")
    public  void Deletar(@RequestBody Docs docs)
    {
        docsRepository.delete(docs);
    }

    @PutMapping("/docs")
    public Docs atualizar(@RequestBody Docs docs)
    {
        return docsRepository.save(docs);
    }




}
