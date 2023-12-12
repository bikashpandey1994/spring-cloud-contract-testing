package com.example.contract.test.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Employee {

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
// standard getters and setters, constructors
}