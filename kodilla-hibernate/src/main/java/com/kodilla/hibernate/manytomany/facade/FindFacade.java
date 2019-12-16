package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanyByLetters(String letters) {
        List<Company> companyList = companyDao.retrieveCompanyWithLetters(letters);
        return companyList;
    }

    public List<Employee> findEmployeeByLetters(String letters){
        List<Employee> employeeList = employeeDao.retrieveEmployeeWithLetters(letters);
        return employeeList;
    }
}
