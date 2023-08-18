package com.example.demo.Service;

import com.example.demo.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User create(User user);
}
