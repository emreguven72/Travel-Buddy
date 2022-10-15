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
@Table(name = "travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "travel_id")
    private int id;

    @NotBlank
    @NotNull
    @Column(name = "start_location")
    private String startLocation;

    @NotBlank
    @NotNull
    @Column(name = "end_location")
    private String endLocation;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    @NotBlank
    @NotNull
    public User user;
}
