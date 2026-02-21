package com.raheena.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.raheena.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}