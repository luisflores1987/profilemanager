package com.apiservi.profilemanager.repo;

import com.apiservi.profilemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> { /*Se coloca el objeto y su tipo de primary key*/
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
