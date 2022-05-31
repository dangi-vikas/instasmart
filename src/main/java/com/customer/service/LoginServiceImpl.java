package com.customer.service;

import com.customer.domain.User;
import com.customer.exception.UserNotFoundException;
import com.customer.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User userLogin(User user) {
        User response = null;

        try {
            response = userRepository.findByUsername(user.getUsername())
                    .orElseThrow(
                            () -> new UserNotFoundException("User Not Found with username: " + user.getUsername()));
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        if (!(user.getPassword().equals(response.getPassword()))) {
            try {
                throw new Exception("Username or Password is incorrect");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return response;
    }

}
