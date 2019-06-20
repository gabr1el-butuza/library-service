package com.library.service.domain;

import com.library.service.dto.User;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
    @NotNull
    private String username;

    @NotNull
    private String password;

    private String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = "USER";
    }

    public static User toUser(UserEntity userEntity) {
        User user = new User();

        user.setId(userEntity.getId());
        user.setUsername(userEntity.getUsername());
        user.setPassword(userEntity.getPassword());
        user.setRole(userEntity.getRole());

        return user;
    }
}
