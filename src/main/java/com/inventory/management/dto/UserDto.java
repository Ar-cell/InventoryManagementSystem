package com.inventory.management.dto;

import com.inventory.management.entity.Role;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Integer id;

    @NotEmpty(message = "name can't be null")
    private String name;

//    @Email(message = "Email sholud be valid")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    @Size(min = 8, message = "Password length must be minimum 8")
    private String password;

    private String gender;

    @NotNull(message = "address can't be empty")
    private String address;

    @Size(min = 10, max = 10, message = "enter valid mobile number")
    private String mobile;

    @Size(min = 6, message = "pin should be 6 digit long")
    private String pincode;

    private Role role;

}
