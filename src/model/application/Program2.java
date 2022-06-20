package model.application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST1: seller, findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST2: seller, findAll ===");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST3: seller, insert ===");
        Department newDepartment = new Department(null, "Cursos");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted New Id: " + newDepartment.getId());

        System.out.println("\n=== TEST5: seller, update ===");
        department = departmentDao.findById(4);
        department.setName("E-Books");
        departmentDao.update(department);
        System.out.println("Update complete");

        System.out.println("\n=== TEST5: seller, delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deleted!");
    }
}
