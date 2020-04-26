package com.arturtarcisio.workshopmongo.services;

import com.arturtarcisio.workshopmongo.domain.User;
import com.arturtarcisio.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

}
