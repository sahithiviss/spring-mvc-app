package com.dbs.springmvcapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Employee {

    public Employee(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public Employee(long id, String name){
        this.id = id;
        this.name = name;
    }
}