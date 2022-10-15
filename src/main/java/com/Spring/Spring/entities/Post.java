package com.Spring.Spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private int id;

    @Column(name = "post_description")
    private String postDescription;

    @Column(name = "post_image")
    private String postImage;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    @NotBlank
    @NotNull
    public User user;
}
