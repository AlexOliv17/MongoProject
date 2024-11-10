package org.aoa.mongoproject.resources;

import org.aoa.mongoproject.domain.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> listAll() {
        User maria = new User("1", "maria", "maria@gmail.com");
        User alex = new User("2", "Alex", "Alex@gmail.com");
        List<User> users = new ArrayList<User>();
        users.add(maria);
        users.add(alex);
        return ResponseEntity.ok().body(users);
    }
}
