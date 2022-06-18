package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department departmentObj);
    void update(Department departmentObj);
    void deleteById(Integer Id);
    Department findById(Integer Id);
    List <Department> findAll();
}
