package designprinciples.assistedproblems;

import java.util.*;

// Company class (owns Departments)
class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Composition: Department created ONLY through Company
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addEmployeeToDepartment(String deptName, String empName, int empId) {
        for (Department d : departments) {
            if (d.getDeptName().equalsIgnoreCase(deptName)) {
                d.addEmployee(empName, empId);
                return;
            }
        }
        System.out.println("❌ Department not found: " + deptName);
    }

    public void showCompanyDetails() {
        System.out.println("\n🏢 Company: " + companyName);
        if (departments.isEmpty()) {
            System.out.println("No departments.");
            return;
        }
        for (Department d : departments) {
            d.showDepartmentDetails();
        }
    }

    // When company is deleted, remove all departments & employees
    public void closeCompany() {
        System.out.println("\n⚠ Closing company: " + companyName);

        for (Department d : departments) {
            d.clearEmployees();
        }
        departments.clear();

        System.out.println("✅ Company closed. All departments and employees deleted.");
    }

    // Department class (inner class to enforce composition)
    private class Department {
        private String deptName;
        private List<Employee> employees;

        public Department(String deptName) {
            this.deptName = deptName;
            this.employees = new ArrayList<>();
        }

        public String getDeptName() {
            return deptName;
        }

        // Composition: Employee created ONLY inside Department
        public void addEmployee(String empName, int empId) {
            employees.add(new Employee(empName, empId));
            System.out.println("✅ Employee added: " + empName + " to " + deptName);
        }

        public void showDepartmentDetails() {
            System.out.println("\n📌 Department: " + deptName);
            if (employees.isEmpty()) {
                System.out.println("No employees in this department.");
                return;
            }
            for (Employee e : employees) {
                e.showEmployeeDetails();
            }
        }

        public void clearEmployees() {
            employees.clear();
            System.out.println("🗑 Employees removed from department: " + deptName);
        }

        // Employee class inside Department (strong composition)
        private class Employee {
            private String empName;
            private int empId;

            public Employee(String empName, int empId) {
                this.empName = empName;
                this.empId = empId;
            }

            public void showEmployeeDetails() {
                System.out.println("Employee ID: " + empId + " | Name: " + empName);
            }
        }
    }
}

public class CompanyManagementSystem {
    public static void main(String[] args) {

        Company comp = new Company("TechNova Pvt Ltd");

        comp.addDepartment("IT");
        comp.addDepartment("HR");

        comp.addEmployeeToDepartment("IT", "Navam", 101);
        comp.addEmployeeToDepartment("IT", "Rahul", 102);

        comp.addEmployeeToDepartment("HR", "Priya", 201);

        comp.showCompanyDetails();

        // Composition deletion simulation
        comp.closeCompany();

        // After deletion, everything gone
        comp.showCompanyDetails();
    }
}

