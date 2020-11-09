package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = true)
    private Long id;

    // @Column(name = "First_Name")
    private String f_name;

    // @Column(name = "Last_Name")
    private String l_name;

    public Person() {}

    public Person(String f_name, String l_name) {
        this.f_name = f_name;
        this.l_name = l_name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public Long getId() {
        return id;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getFullName() {
        return this.getF_name() + " " + this.getL_name();
    }
}