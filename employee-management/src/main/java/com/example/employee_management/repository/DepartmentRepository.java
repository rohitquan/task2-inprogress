package com.example.employee_management.repository;

import com.example.employee_management.dto.DepartmentDto;
import com.example.employee_management.dto.EmployeeDto;
import com.example.employee_management.model.DepartmentModel;
import com.example.employee_management.model.EmployeeModel;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository {
    void save(DepartmentDto departmentDto);
    Optional<DepartmentModel> findById(Long id);
    List<DepartmentModel>  findAll();
    void update(Long id ,DepartmentDto departmentDto);
    void deleteById(Long id);
}
