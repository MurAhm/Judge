package com.softuni.model.binding;

import org.hibernate.validator.constraints.Length;

public class UserLoginBindingModel {
    private String username;
    private String password;

    public UserLoginBindingModel() {
    }

    @Length(min = 2, message = "Username length must be minimum two characters!")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Length(min = 3, message = "Password length must be minimum three characters!")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
