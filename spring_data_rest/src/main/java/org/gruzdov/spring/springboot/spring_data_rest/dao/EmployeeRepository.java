package org.gruzdov.spring.springboot.spring_data_rest.dao;


import org.gruzdov.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
