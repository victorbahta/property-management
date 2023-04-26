package com.finalproject.finalproject.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;
    private String name;
    private String email;
    private String password;
    private String role;
    private LocalDate createdDate;
    private String status;

    public void resetPassword() {

    }

    public void logOut() {

    }
}
