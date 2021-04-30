package com.csi.dao;

import java.util.List;

import com.csi.model.Employee;

public interface EmployeeDao {
 
	public List<Employee> getData();
	
	public void saveData();
	
	public void updateData(int empId);
	
	public void deleteData(int empId);
	
	public void getDataById(int empid);
	
	public void deleteAllData();
}
