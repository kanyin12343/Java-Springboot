package com.example.demo.employee;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity // Marks this class as a JPA entity, which will be mapped to a database table
@Table(name = "employee") // Specifies the table name in the database
public class Employee {

    @Id // Indicates the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the IDENTITY strategy should be used for auto-generation of the primary key
    @Column(name = "emp_id") // Maps this field to the "emp_id" column in the database
    private Integer emp_id;

    @Column(name = "first_name") // Maps this field to the "first_name" column in the database
    private String First_name;

    @Column(name = "last_name") // Maps this field to the "last_name" column in the database
    private String Last_name;

    @Column(name = "birth_day") // Maps this field to the "birth_day" column in the database
    private String Birth_day;

    @Column(name = "sex") // Maps this field to the "sex" column in the database
    private String Sex;

    @Column(name = "salary") // Maps this field to the "salary" column in the database
    private Integer Salary;

    @Column(name = "super_id") // Maps this field to the "super_id" column in the database
    private Integer super_id;

    @Column(name = "branch_id") // Maps this field to the "branch_id" column in the database
    private int branch_id;

    @jakarta.persistence.Id // Marks this field as the entity's primary key
    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getBirth_day() {
        return Birth_day;
    }

    public void setBirth_day(String birthday) {
        Birth_day = birthday;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Integer getSuper_id() {
        return super_id;
    }

    public void setSuper_id(int super_id) {
        this.super_id = super_id;
    }

    public Integer getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }
}
