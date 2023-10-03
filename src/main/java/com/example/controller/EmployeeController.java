package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
    	this.employeeService = employeeService;
    }
    
    // データ全件取得
    @GetMapping("/list")
    public String showList(Model model) {
    	List<Employee> employee = this.employeeService.findAllEmployee();
    	model.addAttribute("employee", employee);
    	return "employee/list";
    }
    
    
    // データ1件取得
    @GetMapping("/find/{employeeId}")
    public String showEmployee(@PathVariable Integer employeeId, Model model) {
        Employee employee = this.employeeService.findEmployee(employeeId);
        model.addAttribute("employee", employee);
        return "employee/data";
    }
    
    
    // 絞り込み検索
    @GetMapping("/searchByName/{name}")
    public String searchEmployee(@PathVariable String name, Model model) {
        List<Employee> employees = this.employeeService.findByName(name);
        model.addAttribute("employees", employees);
        return "employee/list";
    }
}
