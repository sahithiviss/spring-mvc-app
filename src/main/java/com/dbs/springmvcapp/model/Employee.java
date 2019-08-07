package com.dbs.springmvcapp.model;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Entity
@Table
@XmlRootElement
public class Employee {

    public Employee(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name cannot be null")
    @XmlElement
    private String name;

    @Range(min = 18, max = 58, message = "Employee age should be between 18 and 58")
    private int age;

    private double salary;

    public Employee(long id, String name){
        this.id = id;
        this.name = name;
    }
}