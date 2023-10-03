package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
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
    
    // データ全件取得
    public List<Employee> findAllEmployee() {
    	return this.employeeRepository.findAll();
    }
    
    // データ1件取得
    public Employee findEmployee(Integer employeeId) {
    	// データ取得
        Optional<Employee> optionalEmployee = this.employeeRepository.findById(employeeId);
        // OptionalからEntityクラスの取得
        Employee employee = optionalEmployee.get();
        return employee;
    }
    
    
    // 絞り込み検索
    public List<Employee> findByName(String name) {
        return this.employeeRepository.findByName(name);
    }
}
