package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> retrieveCompaniesByRandomCharacters(String nameFragment) throws NameFindingException {
        LOGGER.info("Looking for a company...");
        List<Company> companies = companyDao.retrieveCompaniesByRandomCharacters(nameFragment);
        if (companies.isEmpty()) {
            throw new NameFindingException(NameFindingException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> retrieveEmployeesByRandomCharacters(String nameFragment) throws NameFindingException {
        LOGGER.info("Looking for an employee...");
        List<Employee> employees = employeeDao.retrieveEmployeesByRandomCharacters(nameFragment);
        if (employees.isEmpty()) {
            throw new NameFindingException(NameFindingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }
}
