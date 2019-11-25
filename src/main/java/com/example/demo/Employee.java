package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String hrid;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EmployeeTerritoryFunction> employeeTerritoryFunctionList=new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHrid() {
        return hrid;
    }

    public void setHrid(String hrid) {
        this.hrid = hrid;
    }

    public Set<EmployeeTerritoryFunction> getEmployeeTerritoryFunctionList() {
        return employeeTerritoryFunctionList;
    }

    public void setEmployeeTerritoryFunctionList(Set<EmployeeTerritoryFunction> employeeTerritoryFunctionList) {
        this.employeeTerritoryFunctionList = employeeTerritoryFunctionList;
    }

}
