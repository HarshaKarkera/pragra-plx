package com.pragra.pragraplex1.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true,nullable = false)
    private String email;

    private String phone;
    @Column (unique = true )
    private String login;
    private String password;
    @Transient
    private boolean isLoggedIn;
    private Date createDate;
    private Date updateDate;

}
