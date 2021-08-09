package com.example.school.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private Boolean active;

    @OneToMany(mappedBy = "school")
    private List<Student> students;

    public School() {
    }

    public School(Long id, String name, String code, Boolean active) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void seId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getactive() {
        return active;
    }

    public void setactive(Boolean active) {
        this.active = active;
    }

}
