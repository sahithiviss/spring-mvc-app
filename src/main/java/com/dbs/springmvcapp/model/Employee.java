package com.dbs.springmvcapp.model;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@Entity
@Table
public class Employee {

    public Employee(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name cannot be null")
    private String name;

    @Range(min = 18, max = 58, message = "Employee age should be between 18 and 58")
    private int age;

    private LocalDate dateOfBirth;

    @Range(min = 25000, max = 75000)
    private double salary;

    public Employee(long id, String name){
        this.id = id;
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth){
       this.dateOfBirth =  LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public String getDateOfBirth(){
        if(this.dateOfBirth != null) {
            return this.dateOfBirth.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        }
        return "";
    }
}