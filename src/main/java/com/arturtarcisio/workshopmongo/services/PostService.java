package com.arturtarcisio.workshopmongo.services;

import com.arturtarcisio.workshopmongo.domain.Post;
import com.arturtarcisio.workshopmongo.repositories.PostRepository;
import com.arturtarcisio.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
    }

    public List<Post> findAll(){
        return repository.findAll();
    }

}
