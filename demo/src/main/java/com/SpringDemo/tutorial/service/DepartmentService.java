package com.SpringDemo.tutorial.service;

import com.SpringDemo.tutorial.Error.DepartmentNotFoundException;
import com.SpringDemo.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department getDepartmentByID(Long departmentID) throws DepartmentNotFoundException;

    public String deleteDepartMentByID(Long departmentID);

    public Department updateDepartmentservice(Long id,Department department);

    public Department getDepartmentByName(String name);
//    public Department saveDepartment(Department department);
}
