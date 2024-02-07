package com.SpringDemo.tutorial.Controller;

import com.SpringDemo.tutorial.Error.DepartmentNotFoundException;
import com.SpringDemo.tutorial.entity.Department;
import com.SpringDemo.tutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    // take request body convert into Department type
    // RequestMapping => direct GetMappings or Post Mappings
    @Autowired
    private DepartmentService departmentService;
    private final Logger LOGGER = LoggerFactory.getLogger(Department.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Currently in post Mapping");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentID) throws DepartmentNotFoundException {
        return departmentService.getDepartmentByID(departmentID);
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentID){
        return  departmentService.deleteDepartMentByID(departmentID);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentMapping(@PathVariable("id") Long id,@RequestBody Department department){
        return departmentService.updateDepartmentservice(id,department);
    }

    @GetMapping("departments/name/{name}")
    public Department getDepartmentByName(@PathVariable String name) {
        return departmentService.getDepartmentByName(name);
    }

}
