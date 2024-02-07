package com.SpringDemo.tutorial.service;

import com.SpringDemo.tutorial.Error.DepartmentNotFoundException;
import com.SpringDemo.tutorial.Repository.DepartmentRepository;
import com.SpringDemo.tutorial.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements  DepartmentService{
    // press alt + insert to implement methods in interface
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public String deleteDepartMentByID(Long departmentID) {
        departmentRepository.deleteById(departmentID);
        return "Successfully Deleted";
    }

    @Override
    public Department updateDepartmentservice(Long id,Department department) {
        Department department1 = departmentRepository.findById(id).get();
        if(Objects.nonNull(department.getDepartmentName()) && !"".equals(department.getDepartmentName())){
            department1.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode()) && !"".equals(department.getDepartmentCode())){
            department1.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAddress()) && !department.getDepartmentAddress().isEmpty()){
            department1.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(department1);

    }

    @Override
    public Department getDepartmentByID(Long departmentID) throws DepartmentNotFoundException{
        Optional<Department>  department = departmentRepository.findById(departmentID);
        if(department.isPresent()) {
            return  department.get();
        }
        throw new DepartmentNotFoundException("Department Not Available");
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

}
