package com.api.web.controller;

import com.api.web.dto.UserJoinDto;
import com.api.web.entity.User;
import com.api.web.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody UserJoinDto userJoinDto) {
        User user = userService.createUser(userJoinDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
