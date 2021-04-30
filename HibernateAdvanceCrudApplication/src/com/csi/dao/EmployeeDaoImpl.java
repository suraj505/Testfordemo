package com.csi.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.csi.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
	@Override
	public List<Employee> getData() {
		Session session =factory.openSession();
		List<Employee> empList = session.createQuery("from Employee").list();
		return empList;
	}

	@Override
	public void saveData() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setEmpName("GANESH");
		e1.setEmpAddress("Shirdi");
		e1.setEmpSalary(13455.99);
		e1.setEmpDOB(new Date());
		session.save(e1);
		transaction.commit();
		
	}

	@Override
	public void updateData(int empId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee").list();
		for (Employee employee : empList) {
			if(employee.getEmpId()==empId){
				employee.setEmpName("maha");
				employee.setEmpAddress("pune");
				employee.setEmpSalary(354365.99);
				employee.setEmpDOB(new Date());
				session.update(employee);
				transaction.commit();
			}
		}
		
		
		
	}

	@Override
	public void deleteData(int empId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee").list();
		for (Employee employee : empList) {
			if(employee.getEmpId()==empId){
				session.delete(employee);
				transaction.commit();
			}
		}
		
	}

	@Override
	public void getDataById(int empId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee").list();
		for (Employee employee : empList) {
			if(employee.getEmpId()==empId){
				System.out.println(employee);
			}
	 
		}
	}

	@Override
	public void deleteAllData() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query e = session.createQuery("delete Employee");
		e.executeUpdate();
		transaction.commit();
		
	}

}
