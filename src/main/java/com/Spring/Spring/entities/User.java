package com.Spring.Spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","travels","posts"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Email
    @NotBlank
    @NotNull
    @Column(name = "email")
    private String email;

    @NotBlank
    @NotNull
    @Column(name = "username")
    private String username;

    @NotBlank
    @NotNull
    @Column(name = "password")
    private String password;

    @NotBlank
    @NotNull
    @Column(name = "name")
    private String name;

    @NotBlank
    @NotNull
    @Column(name = "surname")
    private String surname;

    @NotBlank
    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "user")
    public List<Travel> travels;

    @OneToMany(mappedBy = "user")
    public List<Post> posts;
}
