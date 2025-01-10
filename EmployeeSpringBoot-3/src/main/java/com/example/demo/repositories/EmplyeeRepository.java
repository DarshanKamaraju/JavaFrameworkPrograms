package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmplyeeRepository extends JpaRepository<Employee,String>
{

}
