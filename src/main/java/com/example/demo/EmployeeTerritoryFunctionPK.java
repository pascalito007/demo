package com.example.demo;

import java.io.Serializable;
import java.util.Objects;


public class EmployeeTerritoryFunctionPK implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long employee;
    private Long territory;

    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }

    public Long getTerritory() {
        return territory;
    }

    public void setTerritory(Long territory) {
        this.territory = territory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTerritoryFunctionPK that = (EmployeeTerritoryFunctionPK) o;
        return Objects.equals(employee, that.employee) &&
                Objects.equals(territory, that.territory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, territory);
    }
}
