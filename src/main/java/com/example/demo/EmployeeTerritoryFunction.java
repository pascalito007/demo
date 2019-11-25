package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@IdClass(value = EmployeeTerritoryFunctionPK.class)
public class EmployeeTerritoryFunction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    private Employee employee;

    @Id
    @ManyToOne
    private Territory territory;

    @ManyToOne
    private Transcode transcode;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Territory getTerritory() {
        return territory;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }

    public Transcode getTranscode() {
        return transcode;
    }

    public void setTranscode(Transcode transcode) {
        this.transcode = transcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTerritoryFunction that = (EmployeeTerritoryFunction) o;
        return Objects.equals(employee, that.employee) &&
                Objects.equals(territory, that.territory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, territory);
    }
}
