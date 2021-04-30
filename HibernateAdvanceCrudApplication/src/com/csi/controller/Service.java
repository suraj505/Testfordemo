package com.csi.controller;

import com.csi.dao.EmployeeDao;
import com.csi.dao.EmployeeDaoImpl;

public class Service {
	public static void main(String[] args) {

		EmployeeDao employeeDaoImpl = new EmployeeDaoImpl();
		
		employeeDaoImpl.getData();
		employeeDaoImpl.saveData();
		//employeeDaoImpl.updateData(1);
		//employeeDaoImpl.deleteData(3);
		//employeeDaoImpl.deleteAllData();
		

	}

}
