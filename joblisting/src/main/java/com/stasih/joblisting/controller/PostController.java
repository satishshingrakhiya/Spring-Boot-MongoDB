package com.stasih.joblisting.controller;

import com.stasih.joblisting.model.Post;
import com.stasih.joblisting.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {

    @Autowired
    private PostRepository repository;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return repository.findAll();
    }
}
