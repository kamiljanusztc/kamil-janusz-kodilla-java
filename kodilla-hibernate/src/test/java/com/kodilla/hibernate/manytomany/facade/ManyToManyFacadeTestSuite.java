package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ManyToManyFacadeTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    void retrieveCompaniesByRandomCharacters() {
        //Given
        Company magicDesign = new Company("Magic Design");
        Company gicSolutions = new Company("GIC solutions");
        Company heads = new Company("4 Heads");

        //When
        companyDao.save(magicDesign);
        companyDao.save(gicSolutions);
        companyDao.save(heads);
        List<Company> companyListWithRandomCharacters = companyDao.retrieveCompaniesByRandomCharacters("gic");

        //Then
        try {
            Assertions.assertEquals(2, companyListWithRandomCharacters.size());
        } finally {
            companyDao.deleteAll();
        }
    }

    @Test
    void retrieveEmployeesByRandomCharacters() {
        //Given
        Employee miti = new Employee("Mike", "Miti");
        Employee taylor = new Employee("Kate", "Taylor");
        Employee itian = new Employee("Joe", "Itian");

        //When
        employeeDao.save(miti);
        employeeDao.save(taylor);
        employeeDao.save(itian);
        List<Employee> employeeListWithRandomCharacters = employeeDao.retrieveEmployeesByRandomCharacters("iti");

        //Then
        try {
            Assertions.assertEquals(2, employeeListWithRandomCharacters.size());
        } finally {
            employeeDao.deleteAll();
        }
    }
}
