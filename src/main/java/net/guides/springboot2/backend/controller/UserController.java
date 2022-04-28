package net.guides.springboot2.backend.controller;

import net.guides.springboot2.backend.repository.UserRepository;
import net.guides.springboot2.backend.service.ProductService;
import net.guides.springboot2.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.guides.springboot2.backend.model.User;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserRepository userRep;

    public UserController() {
    }

    @RequestMapping(value ="/login/{username}",method = RequestMethod.GET)
    public User getUserByUsername(@PathVariable("username") String
                                                  username) {
        return userRep.findByUsername(username);

    }

}
