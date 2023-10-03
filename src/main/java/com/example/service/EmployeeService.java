package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
    // repositoryをフィールドに用意
	private final EmployeeRepository employeeRepository;
	
	// コンストラクタでRepositoryをインジェクション
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
