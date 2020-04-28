package com.arturtarcisio.workshopmongo.resources;

import com.arturtarcisio.workshopmongo.domain.Post;
import com.arturtarcisio.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post post = service.findById(id);
        return ResponseEntity.ok().body(post);
    }

    @GetMapping
    public ResponseEntity<List<Post>> findAll(){
        List<Post> listPosts = service.findAll();
        return ResponseEntity.ok().body(listPosts);
    }
}
