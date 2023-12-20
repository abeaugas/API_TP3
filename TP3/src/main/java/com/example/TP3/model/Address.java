package com.example.TP3.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;
}
