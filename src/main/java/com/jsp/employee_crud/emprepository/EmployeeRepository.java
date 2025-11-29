package com.jsp.employee_crud.emprepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.employee_crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
