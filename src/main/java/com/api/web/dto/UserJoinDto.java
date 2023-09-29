package com.api.web.dto;

import com.api.web.enums.AuthProvider;
import com.api.web.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class UserJoinDto {
    private String email;
    private String name;
    private String oauth2Id;
    private AuthProvider authProvider;
    private Role role;
}