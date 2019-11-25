package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private TerritoryRepository territoryRepository;
    @Autowired
    private TranscodeRepository transcodeRepository;
    @Autowired
    private EmployeeTerritoryFunctionRepository employeeTerritoryFunctionRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        manageData();


    }

    @Transactional
    public void manageData() {
        Employee employee = this.employeeRepository.findByHrid("111");
        if (employee == null) {
            employee = new Employee();
            employee.setHrid("222");
            employee.setName("John DOE");
        }

        Territory territory = new Territory();
        territory.setName("DISCO territory 1");

        Territory territory2 = new Territory();
        territory2.setName("DISCO territory 2");

        Transcode transcode = this.transcodeRepository.findByCode("CC");


        EmployeeTerritoryFunction employeeTerritoryFunction1 = new EmployeeTerritoryFunction();
        employeeTerritoryFunction1.setTranscode(transcode);
        employeeTerritoryFunction1.setTerritory(territory);
        employeeTerritoryFunction1.setEmployee(employee);
        employee.getEmployeeTerritoryFunctionList().add(employeeTerritoryFunction1);

        EmployeeTerritoryFunction employeeTerritoryFunction2 = new EmployeeTerritoryFunction();
        employeeTerritoryFunction2.setTranscode(transcode);
        employeeTerritoryFunction2.setTerritory(territory2);
        employeeTerritoryFunction2.setEmployee(employee);
        employee.getEmployeeTerritoryFunctionList().add(employeeTerritoryFunction2);

        employeeRepository.save(employee);


    }
}
