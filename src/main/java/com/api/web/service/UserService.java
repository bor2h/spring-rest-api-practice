package com.api.web.service;

import com.api.web.dto.UserJoinDto;
import com.api.web.entity.User;
import com.api.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserJoinDto userJoinDto) {
        User user = new User();

        user.setEmail(userJoinDto.getEmail());
        user.setName(userJoinDto.getName());
        user.setOauth2Id(userJoinDto.getOauth2Id());
        user.setAuthProvider(userJoinDto.getAuthProvider());
        user.setRole(userJoinDto.getRole());

        return userRepository.save(user);
    }
}