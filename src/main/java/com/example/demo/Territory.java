package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Territory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "territory", cascade = CascadeType.PERSIST)
    //private Set<EmployeeTerritoryFunction> employeeTerritoryFunctionList=new HashSet<>();

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


    @Override
    public String toString() {
        return "Territory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
