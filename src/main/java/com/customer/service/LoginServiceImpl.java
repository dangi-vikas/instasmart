package com.customer.service;

import com.customer.domain.User;
import com.customer.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User userLogin(User user) {
        User response = userRepository.findByUsername(user.getUsername())
                .orElseThrow(
                        () -> new UsernameNotFoundException("User Not Found with username: " + user.getUsername()));

        if (user.getPassword().equals(response.getPassword()))
            return response;
        else {
            throw new Exception("Username or Password is incorrect");
        }
    }

}
