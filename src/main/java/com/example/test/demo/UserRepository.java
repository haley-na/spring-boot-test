package com.example.test.demo;


import org.springframework.data.repository.CrudRepository;
import com.example.test.demo.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
//    List<User> addNewUser(String username, String email);

}
